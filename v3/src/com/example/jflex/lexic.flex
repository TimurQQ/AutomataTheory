import java.util.ArrayList;
import java.util.List;
%%

%class Lexer
%unicode
%standalone

%{
    private boolean _is_acceptable = false;
    private String messageType = null;
    private final List<String> numbers = new ArrayList<String>();
    private String messageBody = null;
    private final StringBuilder buffer = new StringBuilder();

    public Boolean isSMS() {
            return messageType.equals("sms");
        }

    public List<String> getNumbers() {
            return List.copyOf(numbers);
        }
%}

MsgType = (tel)|(fax)|(sms)
Number = \+[0-9]{11}
BodyText = [0-9a-zA-Z%.,!?]{0,64}

%state YYINITIAL
%state NUMBERS
%state BODY
%state BODYTEXT

%%

<YYINITIAL> {
        {MsgType}/\:{Number}(,{Number})*; {messageType = yytext(); yybegin(NUMBERS);}
        . {_is_acceptable = false; return 0;}
}

<NUMBERS> {
        {Number} {numbers.add(yytext());}
        \:/{Number}(,{Number})*; {}
        \,/{Number} {}
        \; {yybegin(BODY);}
        . {_is_acceptable = false; return 0;}
}

<BODY> {
        \n {_is_acceptable = true; return 1;}
        \?body= {if (isSMS()) {
                      yybegin(BODYTEXT);
                } else {
                    _is_acceptable = false; return 0;
                }
        }
        . {_is_acceptable = false; return 0;}
}

<BODYTEXT> {
        {BodyText}\n {_is_acceptable = true; return 1;}
        . {_is_acceptable = false; return 0;}
}

/* error fallback */
[^]                              { _is_acceptable = false; return 0; }