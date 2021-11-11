import java.util.ArrayList;
import java.util.List;

public class StateMachine {
    private final StateMachineContext _fsm;
    private boolean _is_acceptable = false;
    private String messageType = null;
    private final List<String> numbers;
    private String messageBody = null;
    private final StringBuilder buffer;

    public StateMachine() {
        buffer = new StringBuilder();
        numbers = new ArrayList<>();
        _fsm = new StateMachineContext(this);
    }

    public boolean CheckString(String string) {
        _fsm.enterStartState();
        clearState();
        StateMachineContext.StateMachineState initialState = _fsm.getState();
        for(int i = 0; i < string.length(); ++i) {
            char sym = string.charAt(i);
            if (sym >= '0' && sym <= '9') {
                _fsm.Digit(sym);
            } else if (sym >= 'A' && sym <= 'Z' || sym >= 'a' && sym <= 'z') {
                _fsm.Letter(sym);
            } else if (sym == ':') {
                _fsm.Colon();
            } else if (sym == '+') {
                _fsm.Plus();
            } else if (sym == ',') {
                _fsm.Comma();
            } else if (sym == ';') {
                _fsm.Semicolon();
            } else if (sym == '?') {
                _fsm.RequestStartSign();
            } else if (sym == '=') {
                _fsm.EqStatement();
            } else if (sym == '.' || sym == '%' || sym == '!') {
                _fsm.Sign(sym);
            } else {
                _fsm.Unknown();
            }
        }
        _fsm.EOS();
        _fsm.setState(initialState);
        return _is_acceptable;
    }

    public boolean matches(String... samples) {
        for (String sample: samples) {
            if (buffer.length() < sample.length()) continue;
            if (buffer.substring(0, sample.length()).equals(sample)) {
                return true;
            }
        }
        return false;
    }

    public boolean isCorrectType() {
        return matches("tel", "fax", "sms");
    }

    public boolean isCorrectParam() {
        return matches("body");
    }

    public boolean checkSymCount(int neededCount) {
        return buffer.length() < neededCount;
    }

    public void addToBuffer(char sym) {
        buffer.append(sym);
    }

    public void setAcceptable() {
        _is_acceptable = true;
    }

    public void setUnacceptable() {
        _is_acceptable = false;
    }

    public String getMessageType() {
        return messageType;
    }

    private void clearState() {
        clearBuffer();
        messageType = "";
        numbers.clear();
        messageBody = "";
    }

    public Boolean isSMS() {
        return messageType.equals("sms");
    }

    public void setMessageType() {
        messageType = buffer.substring(0, 3);
    }

    public void addNumber() {
        numbers.add('+' + buffer.substring(0, 11));
    }

    public List<String> getNumbers() {
        return List.copyOf(numbers);
    }

    public void clearBuffer() {
        buffer.setLength(0);
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody() {
        messageBody = buffer.toString();
    }
}
