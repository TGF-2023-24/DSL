package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RdP'", "'{'", "'transiciones'", "'}'", "'lugares'", "'arcos'", "','", "'Transicion'", "'Lugar'", "'marca'", "'Arco'", "'peso'", "'-'", "'ArcoTL'", "'origen'", "'destino'", "'ArcoLT'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRdP"
    // InternalMyDsl.g:53:1: entryRuleRdP : ruleRdP EOF ;
    public final void entryRuleRdP() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRdP EOF )
            // InternalMyDsl.g:55:1: ruleRdP EOF
            {
             before(grammarAccess.getRdPRule()); 
            pushFollow(FOLLOW_1);
            ruleRdP();

            state._fsp--;

             after(grammarAccess.getRdPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRdP"


    // $ANTLR start "ruleRdP"
    // InternalMyDsl.g:62:1: ruleRdP : ( ( rule__RdP__Group__0 ) ) ;
    public final void ruleRdP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__RdP__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__RdP__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__RdP__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__RdP__Group__0 )
            {
             before(grammarAccess.getRdPAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__RdP__Group__0 )
            // InternalMyDsl.g:69:4: rule__RdP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RdP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRdP"


    // $ANTLR start "entryRuleArco"
    // InternalMyDsl.g:78:1: entryRuleArco : ruleArco EOF ;
    public final void entryRuleArco() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleArco EOF )
            // InternalMyDsl.g:80:1: ruleArco EOF
            {
             before(grammarAccess.getArcoRule()); 
            pushFollow(FOLLOW_1);
            ruleArco();

            state._fsp--;

             after(grammarAccess.getArcoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArco"


    // $ANTLR start "ruleArco"
    // InternalMyDsl.g:87:1: ruleArco : ( ( rule__Arco__Alternatives ) ) ;
    public final void ruleArco() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Arco__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Arco__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Arco__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Arco__Alternatives )
            {
             before(grammarAccess.getArcoAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Arco__Alternatives )
            // InternalMyDsl.g:94:4: rule__Arco__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Arco__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArco"


    // $ANTLR start "entryRuleTransicion"
    // InternalMyDsl.g:103:1: entryRuleTransicion : ruleTransicion EOF ;
    public final void entryRuleTransicion() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTransicion EOF )
            // InternalMyDsl.g:105:1: ruleTransicion EOF
            {
             before(grammarAccess.getTransicionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransicion();

            state._fsp--;

             after(grammarAccess.getTransicionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransicion"


    // $ANTLR start "ruleTransicion"
    // InternalMyDsl.g:112:1: ruleTransicion : ( ( rule__Transicion__Group__0 ) ) ;
    public final void ruleTransicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Transicion__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Transicion__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Transicion__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Transicion__Group__0 )
            {
             before(grammarAccess.getTransicionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Transicion__Group__0 )
            // InternalMyDsl.g:119:4: rule__Transicion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transicion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransicionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransicion"


    // $ANTLR start "entryRuleLugar"
    // InternalMyDsl.g:128:1: entryRuleLugar : ruleLugar EOF ;
    public final void entryRuleLugar() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleLugar EOF )
            // InternalMyDsl.g:130:1: ruleLugar EOF
            {
             before(grammarAccess.getLugarRule()); 
            pushFollow(FOLLOW_1);
            ruleLugar();

            state._fsp--;

             after(grammarAccess.getLugarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLugar"


    // $ANTLR start "ruleLugar"
    // InternalMyDsl.g:137:1: ruleLugar : ( ( rule__Lugar__Group__0 ) ) ;
    public final void ruleLugar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Lugar__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Lugar__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Lugar__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Lugar__Group__0 )
            {
             before(grammarAccess.getLugarAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Lugar__Group__0 )
            // InternalMyDsl.g:144:4: rule__Lugar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lugar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLugarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLugar"


    // $ANTLR start "entryRuleArco_Impl"
    // InternalMyDsl.g:153:1: entryRuleArco_Impl : ruleArco_Impl EOF ;
    public final void entryRuleArco_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleArco_Impl EOF )
            // InternalMyDsl.g:155:1: ruleArco_Impl EOF
            {
             before(grammarAccess.getArco_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleArco_Impl();

            state._fsp--;

             after(grammarAccess.getArco_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArco_Impl"


    // $ANTLR start "ruleArco_Impl"
    // InternalMyDsl.g:162:1: ruleArco_Impl : ( ( rule__Arco_Impl__Group__0 ) ) ;
    public final void ruleArco_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Arco_Impl__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Arco_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Arco_Impl__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Arco_Impl__Group__0 )
            {
             before(grammarAccess.getArco_ImplAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Arco_Impl__Group__0 )
            // InternalMyDsl.g:169:4: rule__Arco_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArco_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArco_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEString EOF )
            // InternalMyDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEInt EOF )
            // InternalMyDsl.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleArcoTL"
    // InternalMyDsl.g:228:1: entryRuleArcoTL : ruleArcoTL EOF ;
    public final void entryRuleArcoTL() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleArcoTL EOF )
            // InternalMyDsl.g:230:1: ruleArcoTL EOF
            {
             before(grammarAccess.getArcoTLRule()); 
            pushFollow(FOLLOW_1);
            ruleArcoTL();

            state._fsp--;

             after(grammarAccess.getArcoTLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArcoTL"


    // $ANTLR start "ruleArcoTL"
    // InternalMyDsl.g:237:1: ruleArcoTL : ( ( rule__ArcoTL__Group__0 ) ) ;
    public final void ruleArcoTL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ArcoTL__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ArcoTL__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ArcoTL__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ArcoTL__Group__0 )
            {
             before(grammarAccess.getArcoTLAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ArcoTL__Group__0 )
            // InternalMyDsl.g:244:4: rule__ArcoTL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcoTLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArcoTL"


    // $ANTLR start "entryRuleArcoLT"
    // InternalMyDsl.g:253:1: entryRuleArcoLT : ruleArcoLT EOF ;
    public final void entryRuleArcoLT() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleArcoLT EOF )
            // InternalMyDsl.g:255:1: ruleArcoLT EOF
            {
             before(grammarAccess.getArcoLTRule()); 
            pushFollow(FOLLOW_1);
            ruleArcoLT();

            state._fsp--;

             after(grammarAccess.getArcoLTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArcoLT"


    // $ANTLR start "ruleArcoLT"
    // InternalMyDsl.g:262:1: ruleArcoLT : ( ( rule__ArcoLT__Group__0 ) ) ;
    public final void ruleArcoLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ArcoLT__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ArcoLT__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ArcoLT__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ArcoLT__Group__0 )
            {
             before(grammarAccess.getArcoLTAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ArcoLT__Group__0 )
            // InternalMyDsl.g:269:4: rule__ArcoLT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcoLTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArcoLT"


    // $ANTLR start "rule__Arco__Alternatives"
    // InternalMyDsl.g:277:1: rule__Arco__Alternatives : ( ( ruleArco_Impl ) | ( ruleArcoTL ) | ( ruleArcoLT ) );
    public final void rule__Arco__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ruleArco_Impl ) | ( ruleArcoTL ) | ( ruleArcoLT ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ruleArco_Impl )
                    {
                    // InternalMyDsl.g:282:2: ( ruleArco_Impl )
                    // InternalMyDsl.g:283:3: ruleArco_Impl
                    {
                     before(grammarAccess.getArcoAccess().getArco_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArco_Impl();

                    state._fsp--;

                     after(grammarAccess.getArcoAccess().getArco_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ruleArcoTL )
                    {
                    // InternalMyDsl.g:288:2: ( ruleArcoTL )
                    // InternalMyDsl.g:289:3: ruleArcoTL
                    {
                     before(grammarAccess.getArcoAccess().getArcoTLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArcoTL();

                    state._fsp--;

                     after(grammarAccess.getArcoAccess().getArcoTLParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ruleArcoLT )
                    {
                    // InternalMyDsl.g:294:2: ( ruleArcoLT )
                    // InternalMyDsl.g:295:3: ruleArcoLT
                    {
                     before(grammarAccess.getArcoAccess().getArcoLTParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleArcoLT();

                    state._fsp--;

                     after(grammarAccess.getArcoAccess().getArcoLTParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:304:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:309:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:309:2: ( RULE_STRING )
                    // InternalMyDsl.g:310:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:315:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:315:2: ( RULE_ID )
                    // InternalMyDsl.g:316:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RdP__Group__0"
    // InternalMyDsl.g:325:1: rule__RdP__Group__0 : rule__RdP__Group__0__Impl rule__RdP__Group__1 ;
    public final void rule__RdP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( rule__RdP__Group__0__Impl rule__RdP__Group__1 )
            // InternalMyDsl.g:330:2: rule__RdP__Group__0__Impl rule__RdP__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RdP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__0"


    // $ANTLR start "rule__RdP__Group__0__Impl"
    // InternalMyDsl.g:337:1: rule__RdP__Group__0__Impl : ( 'RdP' ) ;
    public final void rule__RdP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( ( 'RdP' ) )
            // InternalMyDsl.g:342:1: ( 'RdP' )
            {
            // InternalMyDsl.g:342:1: ( 'RdP' )
            // InternalMyDsl.g:343:2: 'RdP'
            {
             before(grammarAccess.getRdPAccess().getRdPKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getRdPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__0__Impl"


    // $ANTLR start "rule__RdP__Group__1"
    // InternalMyDsl.g:352:1: rule__RdP__Group__1 : rule__RdP__Group__1__Impl rule__RdP__Group__2 ;
    public final void rule__RdP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( rule__RdP__Group__1__Impl rule__RdP__Group__2 )
            // InternalMyDsl.g:357:2: rule__RdP__Group__1__Impl rule__RdP__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RdP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__1"


    // $ANTLR start "rule__RdP__Group__1__Impl"
    // InternalMyDsl.g:364:1: rule__RdP__Group__1__Impl : ( '{' ) ;
    public final void rule__RdP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( ( '{' ) )
            // InternalMyDsl.g:369:1: ( '{' )
            {
            // InternalMyDsl.g:369:1: ( '{' )
            // InternalMyDsl.g:370:2: '{'
            {
             before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__1__Impl"


    // $ANTLR start "rule__RdP__Group__2"
    // InternalMyDsl.g:379:1: rule__RdP__Group__2 : rule__RdP__Group__2__Impl rule__RdP__Group__3 ;
    public final void rule__RdP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( rule__RdP__Group__2__Impl rule__RdP__Group__3 )
            // InternalMyDsl.g:384:2: rule__RdP__Group__2__Impl rule__RdP__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RdP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__2"


    // $ANTLR start "rule__RdP__Group__2__Impl"
    // InternalMyDsl.g:391:1: rule__RdP__Group__2__Impl : ( 'transiciones' ) ;
    public final void rule__RdP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( 'transiciones' ) )
            // InternalMyDsl.g:396:1: ( 'transiciones' )
            {
            // InternalMyDsl.g:396:1: ( 'transiciones' )
            // InternalMyDsl.g:397:2: 'transiciones'
            {
             before(grammarAccess.getRdPAccess().getTransicionesKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getTransicionesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__2__Impl"


    // $ANTLR start "rule__RdP__Group__3"
    // InternalMyDsl.g:406:1: rule__RdP__Group__3 : rule__RdP__Group__3__Impl rule__RdP__Group__4 ;
    public final void rule__RdP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__RdP__Group__3__Impl rule__RdP__Group__4 )
            // InternalMyDsl.g:411:2: rule__RdP__Group__3__Impl rule__RdP__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RdP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__3"


    // $ANTLR start "rule__RdP__Group__3__Impl"
    // InternalMyDsl.g:418:1: rule__RdP__Group__3__Impl : ( '{' ) ;
    public final void rule__RdP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( '{' ) )
            // InternalMyDsl.g:423:1: ( '{' )
            {
            // InternalMyDsl.g:423:1: ( '{' )
            // InternalMyDsl.g:424:2: '{'
            {
             before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__3__Impl"


    // $ANTLR start "rule__RdP__Group__4"
    // InternalMyDsl.g:433:1: rule__RdP__Group__4 : rule__RdP__Group__4__Impl rule__RdP__Group__5 ;
    public final void rule__RdP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__RdP__Group__4__Impl rule__RdP__Group__5 )
            // InternalMyDsl.g:438:2: rule__RdP__Group__4__Impl rule__RdP__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__4"


    // $ANTLR start "rule__RdP__Group__4__Impl"
    // InternalMyDsl.g:445:1: rule__RdP__Group__4__Impl : ( ( rule__RdP__TransicionesAssignment_4 ) ) ;
    public final void rule__RdP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( ( rule__RdP__TransicionesAssignment_4 ) ) )
            // InternalMyDsl.g:450:1: ( ( rule__RdP__TransicionesAssignment_4 ) )
            {
            // InternalMyDsl.g:450:1: ( ( rule__RdP__TransicionesAssignment_4 ) )
            // InternalMyDsl.g:451:2: ( rule__RdP__TransicionesAssignment_4 )
            {
             before(grammarAccess.getRdPAccess().getTransicionesAssignment_4()); 
            // InternalMyDsl.g:452:2: ( rule__RdP__TransicionesAssignment_4 )
            // InternalMyDsl.g:452:3: rule__RdP__TransicionesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RdP__TransicionesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getTransicionesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__4__Impl"


    // $ANTLR start "rule__RdP__Group__5"
    // InternalMyDsl.g:460:1: rule__RdP__Group__5 : rule__RdP__Group__5__Impl rule__RdP__Group__6 ;
    public final void rule__RdP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__RdP__Group__5__Impl rule__RdP__Group__6 )
            // InternalMyDsl.g:465:2: rule__RdP__Group__5__Impl rule__RdP__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__5"


    // $ANTLR start "rule__RdP__Group__5__Impl"
    // InternalMyDsl.g:472:1: rule__RdP__Group__5__Impl : ( ( rule__RdP__Group_5__0 )* ) ;
    public final void rule__RdP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( ( rule__RdP__Group_5__0 )* ) )
            // InternalMyDsl.g:477:1: ( ( rule__RdP__Group_5__0 )* )
            {
            // InternalMyDsl.g:477:1: ( ( rule__RdP__Group_5__0 )* )
            // InternalMyDsl.g:478:2: ( rule__RdP__Group_5__0 )*
            {
             before(grammarAccess.getRdPAccess().getGroup_5()); 
            // InternalMyDsl.g:479:2: ( rule__RdP__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:479:3: rule__RdP__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RdP__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRdPAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__5__Impl"


    // $ANTLR start "rule__RdP__Group__6"
    // InternalMyDsl.g:487:1: rule__RdP__Group__6 : rule__RdP__Group__6__Impl rule__RdP__Group__7 ;
    public final void rule__RdP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__RdP__Group__6__Impl rule__RdP__Group__7 )
            // InternalMyDsl.g:492:2: rule__RdP__Group__6__Impl rule__RdP__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__RdP__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__6"


    // $ANTLR start "rule__RdP__Group__6__Impl"
    // InternalMyDsl.g:499:1: rule__RdP__Group__6__Impl : ( '}' ) ;
    public final void rule__RdP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( '}' ) )
            // InternalMyDsl.g:504:1: ( '}' )
            {
            // InternalMyDsl.g:504:1: ( '}' )
            // InternalMyDsl.g:505:2: '}'
            {
             before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__6__Impl"


    // $ANTLR start "rule__RdP__Group__7"
    // InternalMyDsl.g:514:1: rule__RdP__Group__7 : rule__RdP__Group__7__Impl rule__RdP__Group__8 ;
    public final void rule__RdP__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__RdP__Group__7__Impl rule__RdP__Group__8 )
            // InternalMyDsl.g:519:2: rule__RdP__Group__7__Impl rule__RdP__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__RdP__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__7"


    // $ANTLR start "rule__RdP__Group__7__Impl"
    // InternalMyDsl.g:526:1: rule__RdP__Group__7__Impl : ( 'lugares' ) ;
    public final void rule__RdP__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( 'lugares' ) )
            // InternalMyDsl.g:531:1: ( 'lugares' )
            {
            // InternalMyDsl.g:531:1: ( 'lugares' )
            // InternalMyDsl.g:532:2: 'lugares'
            {
             before(grammarAccess.getRdPAccess().getLugaresKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getLugaresKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__7__Impl"


    // $ANTLR start "rule__RdP__Group__8"
    // InternalMyDsl.g:541:1: rule__RdP__Group__8 : rule__RdP__Group__8__Impl rule__RdP__Group__9 ;
    public final void rule__RdP__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__RdP__Group__8__Impl rule__RdP__Group__9 )
            // InternalMyDsl.g:546:2: rule__RdP__Group__8__Impl rule__RdP__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__RdP__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__8"


    // $ANTLR start "rule__RdP__Group__8__Impl"
    // InternalMyDsl.g:553:1: rule__RdP__Group__8__Impl : ( '{' ) ;
    public final void rule__RdP__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( '{' ) )
            // InternalMyDsl.g:558:1: ( '{' )
            {
            // InternalMyDsl.g:558:1: ( '{' )
            // InternalMyDsl.g:559:2: '{'
            {
             before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__8__Impl"


    // $ANTLR start "rule__RdP__Group__9"
    // InternalMyDsl.g:568:1: rule__RdP__Group__9 : rule__RdP__Group__9__Impl rule__RdP__Group__10 ;
    public final void rule__RdP__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__RdP__Group__9__Impl rule__RdP__Group__10 )
            // InternalMyDsl.g:573:2: rule__RdP__Group__9__Impl rule__RdP__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__9"


    // $ANTLR start "rule__RdP__Group__9__Impl"
    // InternalMyDsl.g:580:1: rule__RdP__Group__9__Impl : ( ( rule__RdP__LugaresAssignment_9 ) ) ;
    public final void rule__RdP__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( ( rule__RdP__LugaresAssignment_9 ) ) )
            // InternalMyDsl.g:585:1: ( ( rule__RdP__LugaresAssignment_9 ) )
            {
            // InternalMyDsl.g:585:1: ( ( rule__RdP__LugaresAssignment_9 ) )
            // InternalMyDsl.g:586:2: ( rule__RdP__LugaresAssignment_9 )
            {
             before(grammarAccess.getRdPAccess().getLugaresAssignment_9()); 
            // InternalMyDsl.g:587:2: ( rule__RdP__LugaresAssignment_9 )
            // InternalMyDsl.g:587:3: rule__RdP__LugaresAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__RdP__LugaresAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getLugaresAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__9__Impl"


    // $ANTLR start "rule__RdP__Group__10"
    // InternalMyDsl.g:595:1: rule__RdP__Group__10 : rule__RdP__Group__10__Impl rule__RdP__Group__11 ;
    public final void rule__RdP__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__RdP__Group__10__Impl rule__RdP__Group__11 )
            // InternalMyDsl.g:600:2: rule__RdP__Group__10__Impl rule__RdP__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__10"


    // $ANTLR start "rule__RdP__Group__10__Impl"
    // InternalMyDsl.g:607:1: rule__RdP__Group__10__Impl : ( ( rule__RdP__Group_10__0 )* ) ;
    public final void rule__RdP__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( ( rule__RdP__Group_10__0 )* ) )
            // InternalMyDsl.g:612:1: ( ( rule__RdP__Group_10__0 )* )
            {
            // InternalMyDsl.g:612:1: ( ( rule__RdP__Group_10__0 )* )
            // InternalMyDsl.g:613:2: ( rule__RdP__Group_10__0 )*
            {
             before(grammarAccess.getRdPAccess().getGroup_10()); 
            // InternalMyDsl.g:614:2: ( rule__RdP__Group_10__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:614:3: rule__RdP__Group_10__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RdP__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRdPAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__10__Impl"


    // $ANTLR start "rule__RdP__Group__11"
    // InternalMyDsl.g:622:1: rule__RdP__Group__11 : rule__RdP__Group__11__Impl rule__RdP__Group__12 ;
    public final void rule__RdP__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__RdP__Group__11__Impl rule__RdP__Group__12 )
            // InternalMyDsl.g:627:2: rule__RdP__Group__11__Impl rule__RdP__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__RdP__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__11"


    // $ANTLR start "rule__RdP__Group__11__Impl"
    // InternalMyDsl.g:634:1: rule__RdP__Group__11__Impl : ( '}' ) ;
    public final void rule__RdP__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( '}' ) )
            // InternalMyDsl.g:639:1: ( '}' )
            {
            // InternalMyDsl.g:639:1: ( '}' )
            // InternalMyDsl.g:640:2: '}'
            {
             before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__11__Impl"


    // $ANTLR start "rule__RdP__Group__12"
    // InternalMyDsl.g:649:1: rule__RdP__Group__12 : rule__RdP__Group__12__Impl rule__RdP__Group__13 ;
    public final void rule__RdP__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__RdP__Group__12__Impl rule__RdP__Group__13 )
            // InternalMyDsl.g:654:2: rule__RdP__Group__12__Impl rule__RdP__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__RdP__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__12"


    // $ANTLR start "rule__RdP__Group__12__Impl"
    // InternalMyDsl.g:661:1: rule__RdP__Group__12__Impl : ( 'arcos' ) ;
    public final void rule__RdP__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( 'arcos' ) )
            // InternalMyDsl.g:666:1: ( 'arcos' )
            {
            // InternalMyDsl.g:666:1: ( 'arcos' )
            // InternalMyDsl.g:667:2: 'arcos'
            {
             before(grammarAccess.getRdPAccess().getArcosKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getArcosKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__12__Impl"


    // $ANTLR start "rule__RdP__Group__13"
    // InternalMyDsl.g:676:1: rule__RdP__Group__13 : rule__RdP__Group__13__Impl rule__RdP__Group__14 ;
    public final void rule__RdP__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__RdP__Group__13__Impl rule__RdP__Group__14 )
            // InternalMyDsl.g:681:2: rule__RdP__Group__13__Impl rule__RdP__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__RdP__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__13"


    // $ANTLR start "rule__RdP__Group__13__Impl"
    // InternalMyDsl.g:688:1: rule__RdP__Group__13__Impl : ( '{' ) ;
    public final void rule__RdP__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( '{' ) )
            // InternalMyDsl.g:693:1: ( '{' )
            {
            // InternalMyDsl.g:693:1: ( '{' )
            // InternalMyDsl.g:694:2: '{'
            {
             before(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__13__Impl"


    // $ANTLR start "rule__RdP__Group__14"
    // InternalMyDsl.g:703:1: rule__RdP__Group__14 : rule__RdP__Group__14__Impl rule__RdP__Group__15 ;
    public final void rule__RdP__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__RdP__Group__14__Impl rule__RdP__Group__15 )
            // InternalMyDsl.g:708:2: rule__RdP__Group__14__Impl rule__RdP__Group__15
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__14"


    // $ANTLR start "rule__RdP__Group__14__Impl"
    // InternalMyDsl.g:715:1: rule__RdP__Group__14__Impl : ( ( rule__RdP__ArcosAssignment_14 ) ) ;
    public final void rule__RdP__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ( rule__RdP__ArcosAssignment_14 ) ) )
            // InternalMyDsl.g:720:1: ( ( rule__RdP__ArcosAssignment_14 ) )
            {
            // InternalMyDsl.g:720:1: ( ( rule__RdP__ArcosAssignment_14 ) )
            // InternalMyDsl.g:721:2: ( rule__RdP__ArcosAssignment_14 )
            {
             before(grammarAccess.getRdPAccess().getArcosAssignment_14()); 
            // InternalMyDsl.g:722:2: ( rule__RdP__ArcosAssignment_14 )
            // InternalMyDsl.g:722:3: rule__RdP__ArcosAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__RdP__ArcosAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getArcosAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__14__Impl"


    // $ANTLR start "rule__RdP__Group__15"
    // InternalMyDsl.g:730:1: rule__RdP__Group__15 : rule__RdP__Group__15__Impl rule__RdP__Group__16 ;
    public final void rule__RdP__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__RdP__Group__15__Impl rule__RdP__Group__16 )
            // InternalMyDsl.g:735:2: rule__RdP__Group__15__Impl rule__RdP__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__RdP__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__15"


    // $ANTLR start "rule__RdP__Group__15__Impl"
    // InternalMyDsl.g:742:1: rule__RdP__Group__15__Impl : ( ( rule__RdP__Group_15__0 )* ) ;
    public final void rule__RdP__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__RdP__Group_15__0 )* ) )
            // InternalMyDsl.g:747:1: ( ( rule__RdP__Group_15__0 )* )
            {
            // InternalMyDsl.g:747:1: ( ( rule__RdP__Group_15__0 )* )
            // InternalMyDsl.g:748:2: ( rule__RdP__Group_15__0 )*
            {
             before(grammarAccess.getRdPAccess().getGroup_15()); 
            // InternalMyDsl.g:749:2: ( rule__RdP__Group_15__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:749:3: rule__RdP__Group_15__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RdP__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRdPAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__15__Impl"


    // $ANTLR start "rule__RdP__Group__16"
    // InternalMyDsl.g:757:1: rule__RdP__Group__16 : rule__RdP__Group__16__Impl rule__RdP__Group__17 ;
    public final void rule__RdP__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__RdP__Group__16__Impl rule__RdP__Group__17 )
            // InternalMyDsl.g:762:2: rule__RdP__Group__16__Impl rule__RdP__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__RdP__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__16"


    // $ANTLR start "rule__RdP__Group__16__Impl"
    // InternalMyDsl.g:769:1: rule__RdP__Group__16__Impl : ( '}' ) ;
    public final void rule__RdP__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( '}' ) )
            // InternalMyDsl.g:774:1: ( '}' )
            {
            // InternalMyDsl.g:774:1: ( '}' )
            // InternalMyDsl.g:775:2: '}'
            {
             before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__16__Impl"


    // $ANTLR start "rule__RdP__Group__17"
    // InternalMyDsl.g:784:1: rule__RdP__Group__17 : rule__RdP__Group__17__Impl ;
    public final void rule__RdP__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__RdP__Group__17__Impl )
            // InternalMyDsl.g:789:2: rule__RdP__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RdP__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__17"


    // $ANTLR start "rule__RdP__Group__17__Impl"
    // InternalMyDsl.g:795:1: rule__RdP__Group__17__Impl : ( '}' ) ;
    public final void rule__RdP__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( '}' ) )
            // InternalMyDsl.g:800:1: ( '}' )
            {
            // InternalMyDsl.g:800:1: ( '}' )
            // InternalMyDsl.g:801:2: '}'
            {
             before(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_17()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group__17__Impl"


    // $ANTLR start "rule__RdP__Group_5__0"
    // InternalMyDsl.g:811:1: rule__RdP__Group_5__0 : rule__RdP__Group_5__0__Impl rule__RdP__Group_5__1 ;
    public final void rule__RdP__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__RdP__Group_5__0__Impl rule__RdP__Group_5__1 )
            // InternalMyDsl.g:816:2: rule__RdP__Group_5__0__Impl rule__RdP__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RdP__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_5__0"


    // $ANTLR start "rule__RdP__Group_5__0__Impl"
    // InternalMyDsl.g:823:1: rule__RdP__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RdP__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( ',' ) )
            // InternalMyDsl.g:828:1: ( ',' )
            {
            // InternalMyDsl.g:828:1: ( ',' )
            // InternalMyDsl.g:829:2: ','
            {
             before(grammarAccess.getRdPAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_5__0__Impl"


    // $ANTLR start "rule__RdP__Group_5__1"
    // InternalMyDsl.g:838:1: rule__RdP__Group_5__1 : rule__RdP__Group_5__1__Impl ;
    public final void rule__RdP__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__RdP__Group_5__1__Impl )
            // InternalMyDsl.g:843:2: rule__RdP__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RdP__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_5__1"


    // $ANTLR start "rule__RdP__Group_5__1__Impl"
    // InternalMyDsl.g:849:1: rule__RdP__Group_5__1__Impl : ( ( rule__RdP__TransicionesAssignment_5_1 ) ) ;
    public final void rule__RdP__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( ( rule__RdP__TransicionesAssignment_5_1 ) ) )
            // InternalMyDsl.g:854:1: ( ( rule__RdP__TransicionesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:854:1: ( ( rule__RdP__TransicionesAssignment_5_1 ) )
            // InternalMyDsl.g:855:2: ( rule__RdP__TransicionesAssignment_5_1 )
            {
             before(grammarAccess.getRdPAccess().getTransicionesAssignment_5_1()); 
            // InternalMyDsl.g:856:2: ( rule__RdP__TransicionesAssignment_5_1 )
            // InternalMyDsl.g:856:3: rule__RdP__TransicionesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RdP__TransicionesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getTransicionesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_5__1__Impl"


    // $ANTLR start "rule__RdP__Group_10__0"
    // InternalMyDsl.g:865:1: rule__RdP__Group_10__0 : rule__RdP__Group_10__0__Impl rule__RdP__Group_10__1 ;
    public final void rule__RdP__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__RdP__Group_10__0__Impl rule__RdP__Group_10__1 )
            // InternalMyDsl.g:870:2: rule__RdP__Group_10__0__Impl rule__RdP__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__RdP__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_10__0"


    // $ANTLR start "rule__RdP__Group_10__0__Impl"
    // InternalMyDsl.g:877:1: rule__RdP__Group_10__0__Impl : ( ',' ) ;
    public final void rule__RdP__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ',' ) )
            // InternalMyDsl.g:882:1: ( ',' )
            {
            // InternalMyDsl.g:882:1: ( ',' )
            // InternalMyDsl.g:883:2: ','
            {
             before(grammarAccess.getRdPAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_10__0__Impl"


    // $ANTLR start "rule__RdP__Group_10__1"
    // InternalMyDsl.g:892:1: rule__RdP__Group_10__1 : rule__RdP__Group_10__1__Impl ;
    public final void rule__RdP__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__RdP__Group_10__1__Impl )
            // InternalMyDsl.g:897:2: rule__RdP__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RdP__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_10__1"


    // $ANTLR start "rule__RdP__Group_10__1__Impl"
    // InternalMyDsl.g:903:1: rule__RdP__Group_10__1__Impl : ( ( rule__RdP__LugaresAssignment_10_1 ) ) ;
    public final void rule__RdP__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ( rule__RdP__LugaresAssignment_10_1 ) ) )
            // InternalMyDsl.g:908:1: ( ( rule__RdP__LugaresAssignment_10_1 ) )
            {
            // InternalMyDsl.g:908:1: ( ( rule__RdP__LugaresAssignment_10_1 ) )
            // InternalMyDsl.g:909:2: ( rule__RdP__LugaresAssignment_10_1 )
            {
             before(grammarAccess.getRdPAccess().getLugaresAssignment_10_1()); 
            // InternalMyDsl.g:910:2: ( rule__RdP__LugaresAssignment_10_1 )
            // InternalMyDsl.g:910:3: rule__RdP__LugaresAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__RdP__LugaresAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getLugaresAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_10__1__Impl"


    // $ANTLR start "rule__RdP__Group_15__0"
    // InternalMyDsl.g:919:1: rule__RdP__Group_15__0 : rule__RdP__Group_15__0__Impl rule__RdP__Group_15__1 ;
    public final void rule__RdP__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__RdP__Group_15__0__Impl rule__RdP__Group_15__1 )
            // InternalMyDsl.g:924:2: rule__RdP__Group_15__0__Impl rule__RdP__Group_15__1
            {
            pushFollow(FOLLOW_11);
            rule__RdP__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RdP__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_15__0"


    // $ANTLR start "rule__RdP__Group_15__0__Impl"
    // InternalMyDsl.g:931:1: rule__RdP__Group_15__0__Impl : ( ',' ) ;
    public final void rule__RdP__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ',' ) )
            // InternalMyDsl.g:936:1: ( ',' )
            {
            // InternalMyDsl.g:936:1: ( ',' )
            // InternalMyDsl.g:937:2: ','
            {
             before(grammarAccess.getRdPAccess().getCommaKeyword_15_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRdPAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_15__0__Impl"


    // $ANTLR start "rule__RdP__Group_15__1"
    // InternalMyDsl.g:946:1: rule__RdP__Group_15__1 : rule__RdP__Group_15__1__Impl ;
    public final void rule__RdP__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__RdP__Group_15__1__Impl )
            // InternalMyDsl.g:951:2: rule__RdP__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RdP__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_15__1"


    // $ANTLR start "rule__RdP__Group_15__1__Impl"
    // InternalMyDsl.g:957:1: rule__RdP__Group_15__1__Impl : ( ( rule__RdP__ArcosAssignment_15_1 ) ) ;
    public final void rule__RdP__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( ( rule__RdP__ArcosAssignment_15_1 ) ) )
            // InternalMyDsl.g:962:1: ( ( rule__RdP__ArcosAssignment_15_1 ) )
            {
            // InternalMyDsl.g:962:1: ( ( rule__RdP__ArcosAssignment_15_1 ) )
            // InternalMyDsl.g:963:2: ( rule__RdP__ArcosAssignment_15_1 )
            {
             before(grammarAccess.getRdPAccess().getArcosAssignment_15_1()); 
            // InternalMyDsl.g:964:2: ( rule__RdP__ArcosAssignment_15_1 )
            // InternalMyDsl.g:964:3: rule__RdP__ArcosAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__RdP__ArcosAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getRdPAccess().getArcosAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__Group_15__1__Impl"


    // $ANTLR start "rule__Transicion__Group__0"
    // InternalMyDsl.g:973:1: rule__Transicion__Group__0 : rule__Transicion__Group__0__Impl rule__Transicion__Group__1 ;
    public final void rule__Transicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Transicion__Group__0__Impl rule__Transicion__Group__1 )
            // InternalMyDsl.g:978:2: rule__Transicion__Group__0__Impl rule__Transicion__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Transicion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transicion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__0"


    // $ANTLR start "rule__Transicion__Group__0__Impl"
    // InternalMyDsl.g:985:1: rule__Transicion__Group__0__Impl : ( () ) ;
    public final void rule__Transicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( () ) )
            // InternalMyDsl.g:990:1: ( () )
            {
            // InternalMyDsl.g:990:1: ( () )
            // InternalMyDsl.g:991:2: ()
            {
             before(grammarAccess.getTransicionAccess().getTransicionAction_0()); 
            // InternalMyDsl.g:992:2: ()
            // InternalMyDsl.g:992:3: 
            {
            }

             after(grammarAccess.getTransicionAccess().getTransicionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__0__Impl"


    // $ANTLR start "rule__Transicion__Group__1"
    // InternalMyDsl.g:1000:1: rule__Transicion__Group__1 : rule__Transicion__Group__1__Impl rule__Transicion__Group__2 ;
    public final void rule__Transicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Transicion__Group__1__Impl rule__Transicion__Group__2 )
            // InternalMyDsl.g:1005:2: rule__Transicion__Group__1__Impl rule__Transicion__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Transicion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transicion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__1"


    // $ANTLR start "rule__Transicion__Group__1__Impl"
    // InternalMyDsl.g:1012:1: rule__Transicion__Group__1__Impl : ( 'Transicion' ) ;
    public final void rule__Transicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( 'Transicion' ) )
            // InternalMyDsl.g:1017:1: ( 'Transicion' )
            {
            // InternalMyDsl.g:1017:1: ( 'Transicion' )
            // InternalMyDsl.g:1018:2: 'Transicion'
            {
             before(grammarAccess.getTransicionAccess().getTransicionKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransicionAccess().getTransicionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__1__Impl"


    // $ANTLR start "rule__Transicion__Group__2"
    // InternalMyDsl.g:1027:1: rule__Transicion__Group__2 : rule__Transicion__Group__2__Impl ;
    public final void rule__Transicion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Transicion__Group__2__Impl )
            // InternalMyDsl.g:1032:2: rule__Transicion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transicion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__2"


    // $ANTLR start "rule__Transicion__Group__2__Impl"
    // InternalMyDsl.g:1038:1: rule__Transicion__Group__2__Impl : ( ( rule__Transicion__NameAssignment_2 ) ) ;
    public final void rule__Transicion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__Transicion__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__Transicion__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__Transicion__NameAssignment_2 ) )
            // InternalMyDsl.g:1044:2: ( rule__Transicion__NameAssignment_2 )
            {
             before(grammarAccess.getTransicionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1045:2: ( rule__Transicion__NameAssignment_2 )
            // InternalMyDsl.g:1045:3: rule__Transicion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transicion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransicionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__Group__2__Impl"


    // $ANTLR start "rule__Lugar__Group__0"
    // InternalMyDsl.g:1054:1: rule__Lugar__Group__0 : rule__Lugar__Group__0__Impl rule__Lugar__Group__1 ;
    public final void rule__Lugar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Lugar__Group__0__Impl rule__Lugar__Group__1 )
            // InternalMyDsl.g:1059:2: rule__Lugar__Group__0__Impl rule__Lugar__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Lugar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lugar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__0"


    // $ANTLR start "rule__Lugar__Group__0__Impl"
    // InternalMyDsl.g:1066:1: rule__Lugar__Group__0__Impl : ( 'Lugar' ) ;
    public final void rule__Lugar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( 'Lugar' ) )
            // InternalMyDsl.g:1071:1: ( 'Lugar' )
            {
            // InternalMyDsl.g:1071:1: ( 'Lugar' )
            // InternalMyDsl.g:1072:2: 'Lugar'
            {
             before(grammarAccess.getLugarAccess().getLugarKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLugarAccess().getLugarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__0__Impl"


    // $ANTLR start "rule__Lugar__Group__1"
    // InternalMyDsl.g:1081:1: rule__Lugar__Group__1 : rule__Lugar__Group__1__Impl rule__Lugar__Group__2 ;
    public final void rule__Lugar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Lugar__Group__1__Impl rule__Lugar__Group__2 )
            // InternalMyDsl.g:1086:2: rule__Lugar__Group__1__Impl rule__Lugar__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Lugar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lugar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__1"


    // $ANTLR start "rule__Lugar__Group__1__Impl"
    // InternalMyDsl.g:1093:1: rule__Lugar__Group__1__Impl : ( ( rule__Lugar__NameAssignment_1 ) ) ;
    public final void rule__Lugar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( ( rule__Lugar__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1098:1: ( ( rule__Lugar__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1098:1: ( ( rule__Lugar__NameAssignment_1 ) )
            // InternalMyDsl.g:1099:2: ( rule__Lugar__NameAssignment_1 )
            {
             before(grammarAccess.getLugarAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1100:2: ( rule__Lugar__NameAssignment_1 )
            // InternalMyDsl.g:1100:3: rule__Lugar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lugar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLugarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__1__Impl"


    // $ANTLR start "rule__Lugar__Group__2"
    // InternalMyDsl.g:1108:1: rule__Lugar__Group__2 : rule__Lugar__Group__2__Impl rule__Lugar__Group__3 ;
    public final void rule__Lugar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Lugar__Group__2__Impl rule__Lugar__Group__3 )
            // InternalMyDsl.g:1113:2: rule__Lugar__Group__2__Impl rule__Lugar__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Lugar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lugar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__2"


    // $ANTLR start "rule__Lugar__Group__2__Impl"
    // InternalMyDsl.g:1120:1: rule__Lugar__Group__2__Impl : ( '{' ) ;
    public final void rule__Lugar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( '{' ) )
            // InternalMyDsl.g:1125:1: ( '{' )
            {
            // InternalMyDsl.g:1125:1: ( '{' )
            // InternalMyDsl.g:1126:2: '{'
            {
             before(grammarAccess.getLugarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLugarAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__2__Impl"


    // $ANTLR start "rule__Lugar__Group__3"
    // InternalMyDsl.g:1135:1: rule__Lugar__Group__3 : rule__Lugar__Group__3__Impl rule__Lugar__Group__4 ;
    public final void rule__Lugar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Lugar__Group__3__Impl rule__Lugar__Group__4 )
            // InternalMyDsl.g:1140:2: rule__Lugar__Group__3__Impl rule__Lugar__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Lugar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lugar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__3"


    // $ANTLR start "rule__Lugar__Group__3__Impl"
    // InternalMyDsl.g:1147:1: rule__Lugar__Group__3__Impl : ( 'marca' ) ;
    public final void rule__Lugar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( 'marca' ) )
            // InternalMyDsl.g:1152:1: ( 'marca' )
            {
            // InternalMyDsl.g:1152:1: ( 'marca' )
            // InternalMyDsl.g:1153:2: 'marca'
            {
             before(grammarAccess.getLugarAccess().getMarcaKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLugarAccess().getMarcaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__3__Impl"


    // $ANTLR start "rule__Lugar__Group__4"
    // InternalMyDsl.g:1162:1: rule__Lugar__Group__4 : rule__Lugar__Group__4__Impl rule__Lugar__Group__5 ;
    public final void rule__Lugar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Lugar__Group__4__Impl rule__Lugar__Group__5 )
            // InternalMyDsl.g:1167:2: rule__Lugar__Group__4__Impl rule__Lugar__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Lugar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lugar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__4"


    // $ANTLR start "rule__Lugar__Group__4__Impl"
    // InternalMyDsl.g:1174:1: rule__Lugar__Group__4__Impl : ( ( rule__Lugar__MarcaAssignment_4 ) ) ;
    public final void rule__Lugar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ( rule__Lugar__MarcaAssignment_4 ) ) )
            // InternalMyDsl.g:1179:1: ( ( rule__Lugar__MarcaAssignment_4 ) )
            {
            // InternalMyDsl.g:1179:1: ( ( rule__Lugar__MarcaAssignment_4 ) )
            // InternalMyDsl.g:1180:2: ( rule__Lugar__MarcaAssignment_4 )
            {
             before(grammarAccess.getLugarAccess().getMarcaAssignment_4()); 
            // InternalMyDsl.g:1181:2: ( rule__Lugar__MarcaAssignment_4 )
            // InternalMyDsl.g:1181:3: rule__Lugar__MarcaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lugar__MarcaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLugarAccess().getMarcaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__4__Impl"


    // $ANTLR start "rule__Lugar__Group__5"
    // InternalMyDsl.g:1189:1: rule__Lugar__Group__5 : rule__Lugar__Group__5__Impl ;
    public final void rule__Lugar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Lugar__Group__5__Impl )
            // InternalMyDsl.g:1194:2: rule__Lugar__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lugar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__5"


    // $ANTLR start "rule__Lugar__Group__5__Impl"
    // InternalMyDsl.g:1200:1: rule__Lugar__Group__5__Impl : ( '}' ) ;
    public final void rule__Lugar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( '}' ) )
            // InternalMyDsl.g:1205:1: ( '}' )
            {
            // InternalMyDsl.g:1205:1: ( '}' )
            // InternalMyDsl.g:1206:2: '}'
            {
             before(grammarAccess.getLugarAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLugarAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__Group__5__Impl"


    // $ANTLR start "rule__Arco_Impl__Group__0"
    // InternalMyDsl.g:1216:1: rule__Arco_Impl__Group__0 : rule__Arco_Impl__Group__0__Impl rule__Arco_Impl__Group__1 ;
    public final void rule__Arco_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__Arco_Impl__Group__0__Impl rule__Arco_Impl__Group__1 )
            // InternalMyDsl.g:1221:2: rule__Arco_Impl__Group__0__Impl rule__Arco_Impl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Arco_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__0"


    // $ANTLR start "rule__Arco_Impl__Group__0__Impl"
    // InternalMyDsl.g:1228:1: rule__Arco_Impl__Group__0__Impl : ( 'Arco' ) ;
    public final void rule__Arco_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( 'Arco' ) )
            // InternalMyDsl.g:1233:1: ( 'Arco' )
            {
            // InternalMyDsl.g:1233:1: ( 'Arco' )
            // InternalMyDsl.g:1234:2: 'Arco'
            {
             before(grammarAccess.getArco_ImplAccess().getArcoKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArco_ImplAccess().getArcoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__0__Impl"


    // $ANTLR start "rule__Arco_Impl__Group__1"
    // InternalMyDsl.g:1243:1: rule__Arco_Impl__Group__1 : rule__Arco_Impl__Group__1__Impl rule__Arco_Impl__Group__2 ;
    public final void rule__Arco_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__Arco_Impl__Group__1__Impl rule__Arco_Impl__Group__2 )
            // InternalMyDsl.g:1248:2: rule__Arco_Impl__Group__1__Impl rule__Arco_Impl__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Arco_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__1"


    // $ANTLR start "rule__Arco_Impl__Group__1__Impl"
    // InternalMyDsl.g:1255:1: rule__Arco_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__Arco_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( '{' ) )
            // InternalMyDsl.g:1260:1: ( '{' )
            {
            // InternalMyDsl.g:1260:1: ( '{' )
            // InternalMyDsl.g:1261:2: '{'
            {
             before(grammarAccess.getArco_ImplAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArco_ImplAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__1__Impl"


    // $ANTLR start "rule__Arco_Impl__Group__2"
    // InternalMyDsl.g:1270:1: rule__Arco_Impl__Group__2 : rule__Arco_Impl__Group__2__Impl rule__Arco_Impl__Group__3 ;
    public final void rule__Arco_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__Arco_Impl__Group__2__Impl rule__Arco_Impl__Group__3 )
            // InternalMyDsl.g:1275:2: rule__Arco_Impl__Group__2__Impl rule__Arco_Impl__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Arco_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__2"


    // $ANTLR start "rule__Arco_Impl__Group__2__Impl"
    // InternalMyDsl.g:1282:1: rule__Arco_Impl__Group__2__Impl : ( 'peso' ) ;
    public final void rule__Arco_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( 'peso' ) )
            // InternalMyDsl.g:1287:1: ( 'peso' )
            {
            // InternalMyDsl.g:1287:1: ( 'peso' )
            // InternalMyDsl.g:1288:2: 'peso'
            {
             before(grammarAccess.getArco_ImplAccess().getPesoKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArco_ImplAccess().getPesoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__2__Impl"


    // $ANTLR start "rule__Arco_Impl__Group__3"
    // InternalMyDsl.g:1297:1: rule__Arco_Impl__Group__3 : rule__Arco_Impl__Group__3__Impl rule__Arco_Impl__Group__4 ;
    public final void rule__Arco_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Arco_Impl__Group__3__Impl rule__Arco_Impl__Group__4 )
            // InternalMyDsl.g:1302:2: rule__Arco_Impl__Group__3__Impl rule__Arco_Impl__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Arco_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__3"


    // $ANTLR start "rule__Arco_Impl__Group__3__Impl"
    // InternalMyDsl.g:1309:1: rule__Arco_Impl__Group__3__Impl : ( ( rule__Arco_Impl__PesoAssignment_3 ) ) ;
    public final void rule__Arco_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ( rule__Arco_Impl__PesoAssignment_3 ) ) )
            // InternalMyDsl.g:1314:1: ( ( rule__Arco_Impl__PesoAssignment_3 ) )
            {
            // InternalMyDsl.g:1314:1: ( ( rule__Arco_Impl__PesoAssignment_3 ) )
            // InternalMyDsl.g:1315:2: ( rule__Arco_Impl__PesoAssignment_3 )
            {
             before(grammarAccess.getArco_ImplAccess().getPesoAssignment_3()); 
            // InternalMyDsl.g:1316:2: ( rule__Arco_Impl__PesoAssignment_3 )
            // InternalMyDsl.g:1316:3: rule__Arco_Impl__PesoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Arco_Impl__PesoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArco_ImplAccess().getPesoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__3__Impl"


    // $ANTLR start "rule__Arco_Impl__Group__4"
    // InternalMyDsl.g:1324:1: rule__Arco_Impl__Group__4 : rule__Arco_Impl__Group__4__Impl ;
    public final void rule__Arco_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Arco_Impl__Group__4__Impl )
            // InternalMyDsl.g:1329:2: rule__Arco_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arco_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__4"


    // $ANTLR start "rule__Arco_Impl__Group__4__Impl"
    // InternalMyDsl.g:1335:1: rule__Arco_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Arco_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( '}' ) )
            // InternalMyDsl.g:1340:1: ( '}' )
            {
            // InternalMyDsl.g:1340:1: ( '}' )
            // InternalMyDsl.g:1341:2: '}'
            {
             before(grammarAccess.getArco_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArco_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1351:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1356:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1363:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1368:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1368:1: ( ( '-' )? )
            // InternalMyDsl.g:1369:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1370:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1370:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1378:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1383:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1389:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1394:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1394:1: ( RULE_INT )
            // InternalMyDsl.g:1395:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ArcoTL__Group__0"
    // InternalMyDsl.g:1405:1: rule__ArcoTL__Group__0 : rule__ArcoTL__Group__0__Impl rule__ArcoTL__Group__1 ;
    public final void rule__ArcoTL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__ArcoTL__Group__0__Impl rule__ArcoTL__Group__1 )
            // InternalMyDsl.g:1410:2: rule__ArcoTL__Group__0__Impl rule__ArcoTL__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArcoTL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__0"


    // $ANTLR start "rule__ArcoTL__Group__0__Impl"
    // InternalMyDsl.g:1417:1: rule__ArcoTL__Group__0__Impl : ( 'ArcoTL' ) ;
    public final void rule__ArcoTL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( 'ArcoTL' ) )
            // InternalMyDsl.g:1422:1: ( 'ArcoTL' )
            {
            // InternalMyDsl.g:1422:1: ( 'ArcoTL' )
            // InternalMyDsl.g:1423:2: 'ArcoTL'
            {
             before(grammarAccess.getArcoTLAccess().getArcoTLKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getArcoTLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__0__Impl"


    // $ANTLR start "rule__ArcoTL__Group__1"
    // InternalMyDsl.g:1432:1: rule__ArcoTL__Group__1 : rule__ArcoTL__Group__1__Impl rule__ArcoTL__Group__2 ;
    public final void rule__ArcoTL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__ArcoTL__Group__1__Impl rule__ArcoTL__Group__2 )
            // InternalMyDsl.g:1437:2: rule__ArcoTL__Group__1__Impl rule__ArcoTL__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ArcoTL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__1"


    // $ANTLR start "rule__ArcoTL__Group__1__Impl"
    // InternalMyDsl.g:1444:1: rule__ArcoTL__Group__1__Impl : ( '{' ) ;
    public final void rule__ArcoTL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( '{' ) )
            // InternalMyDsl.g:1449:1: ( '{' )
            {
            // InternalMyDsl.g:1449:1: ( '{' )
            // InternalMyDsl.g:1450:2: '{'
            {
             before(grammarAccess.getArcoTLAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__1__Impl"


    // $ANTLR start "rule__ArcoTL__Group__2"
    // InternalMyDsl.g:1459:1: rule__ArcoTL__Group__2 : rule__ArcoTL__Group__2__Impl rule__ArcoTL__Group__3 ;
    public final void rule__ArcoTL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__ArcoTL__Group__2__Impl rule__ArcoTL__Group__3 )
            // InternalMyDsl.g:1464:2: rule__ArcoTL__Group__2__Impl rule__ArcoTL__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ArcoTL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__2"


    // $ANTLR start "rule__ArcoTL__Group__2__Impl"
    // InternalMyDsl.g:1471:1: rule__ArcoTL__Group__2__Impl : ( 'peso' ) ;
    public final void rule__ArcoTL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( 'peso' ) )
            // InternalMyDsl.g:1476:1: ( 'peso' )
            {
            // InternalMyDsl.g:1476:1: ( 'peso' )
            // InternalMyDsl.g:1477:2: 'peso'
            {
             before(grammarAccess.getArcoTLAccess().getPesoKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getPesoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__2__Impl"


    // $ANTLR start "rule__ArcoTL__Group__3"
    // InternalMyDsl.g:1486:1: rule__ArcoTL__Group__3 : rule__ArcoTL__Group__3__Impl rule__ArcoTL__Group__4 ;
    public final void rule__ArcoTL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__ArcoTL__Group__3__Impl rule__ArcoTL__Group__4 )
            // InternalMyDsl.g:1491:2: rule__ArcoTL__Group__3__Impl rule__ArcoTL__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ArcoTL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__3"


    // $ANTLR start "rule__ArcoTL__Group__3__Impl"
    // InternalMyDsl.g:1498:1: rule__ArcoTL__Group__3__Impl : ( ( rule__ArcoTL__PesoAssignment_3 ) ) ;
    public final void rule__ArcoTL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ( rule__ArcoTL__PesoAssignment_3 ) ) )
            // InternalMyDsl.g:1503:1: ( ( rule__ArcoTL__PesoAssignment_3 ) )
            {
            // InternalMyDsl.g:1503:1: ( ( rule__ArcoTL__PesoAssignment_3 ) )
            // InternalMyDsl.g:1504:2: ( rule__ArcoTL__PesoAssignment_3 )
            {
             before(grammarAccess.getArcoTLAccess().getPesoAssignment_3()); 
            // InternalMyDsl.g:1505:2: ( rule__ArcoTL__PesoAssignment_3 )
            // InternalMyDsl.g:1505:3: rule__ArcoTL__PesoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArcoTL__PesoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArcoTLAccess().getPesoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__3__Impl"


    // $ANTLR start "rule__ArcoTL__Group__4"
    // InternalMyDsl.g:1513:1: rule__ArcoTL__Group__4 : rule__ArcoTL__Group__4__Impl rule__ArcoTL__Group__5 ;
    public final void rule__ArcoTL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__ArcoTL__Group__4__Impl rule__ArcoTL__Group__5 )
            // InternalMyDsl.g:1518:2: rule__ArcoTL__Group__4__Impl rule__ArcoTL__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ArcoTL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__4"


    // $ANTLR start "rule__ArcoTL__Group__4__Impl"
    // InternalMyDsl.g:1525:1: rule__ArcoTL__Group__4__Impl : ( 'origen' ) ;
    public final void rule__ArcoTL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( 'origen' ) )
            // InternalMyDsl.g:1530:1: ( 'origen' )
            {
            // InternalMyDsl.g:1530:1: ( 'origen' )
            // InternalMyDsl.g:1531:2: 'origen'
            {
             before(grammarAccess.getArcoTLAccess().getOrigenKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getOrigenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__4__Impl"


    // $ANTLR start "rule__ArcoTL__Group__5"
    // InternalMyDsl.g:1540:1: rule__ArcoTL__Group__5 : rule__ArcoTL__Group__5__Impl rule__ArcoTL__Group__6 ;
    public final void rule__ArcoTL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__ArcoTL__Group__5__Impl rule__ArcoTL__Group__6 )
            // InternalMyDsl.g:1545:2: rule__ArcoTL__Group__5__Impl rule__ArcoTL__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ArcoTL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__5"


    // $ANTLR start "rule__ArcoTL__Group__5__Impl"
    // InternalMyDsl.g:1552:1: rule__ArcoTL__Group__5__Impl : ( ( rule__ArcoTL__OrigenAssignment_5 ) ) ;
    public final void rule__ArcoTL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ( rule__ArcoTL__OrigenAssignment_5 ) ) )
            // InternalMyDsl.g:1557:1: ( ( rule__ArcoTL__OrigenAssignment_5 ) )
            {
            // InternalMyDsl.g:1557:1: ( ( rule__ArcoTL__OrigenAssignment_5 ) )
            // InternalMyDsl.g:1558:2: ( rule__ArcoTL__OrigenAssignment_5 )
            {
             before(grammarAccess.getArcoTLAccess().getOrigenAssignment_5()); 
            // InternalMyDsl.g:1559:2: ( rule__ArcoTL__OrigenAssignment_5 )
            // InternalMyDsl.g:1559:3: rule__ArcoTL__OrigenAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ArcoTL__OrigenAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArcoTLAccess().getOrigenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__5__Impl"


    // $ANTLR start "rule__ArcoTL__Group__6"
    // InternalMyDsl.g:1567:1: rule__ArcoTL__Group__6 : rule__ArcoTL__Group__6__Impl rule__ArcoTL__Group__7 ;
    public final void rule__ArcoTL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__ArcoTL__Group__6__Impl rule__ArcoTL__Group__7 )
            // InternalMyDsl.g:1572:2: rule__ArcoTL__Group__6__Impl rule__ArcoTL__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ArcoTL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__6"


    // $ANTLR start "rule__ArcoTL__Group__6__Impl"
    // InternalMyDsl.g:1579:1: rule__ArcoTL__Group__6__Impl : ( 'destino' ) ;
    public final void rule__ArcoTL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( 'destino' ) )
            // InternalMyDsl.g:1584:1: ( 'destino' )
            {
            // InternalMyDsl.g:1584:1: ( 'destino' )
            // InternalMyDsl.g:1585:2: 'destino'
            {
             before(grammarAccess.getArcoTLAccess().getDestinoKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getDestinoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__6__Impl"


    // $ANTLR start "rule__ArcoTL__Group__7"
    // InternalMyDsl.g:1594:1: rule__ArcoTL__Group__7 : rule__ArcoTL__Group__7__Impl rule__ArcoTL__Group__8 ;
    public final void rule__ArcoTL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__ArcoTL__Group__7__Impl rule__ArcoTL__Group__8 )
            // InternalMyDsl.g:1599:2: rule__ArcoTL__Group__7__Impl rule__ArcoTL__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ArcoTL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__7"


    // $ANTLR start "rule__ArcoTL__Group__7__Impl"
    // InternalMyDsl.g:1606:1: rule__ArcoTL__Group__7__Impl : ( ( rule__ArcoTL__DestinoAssignment_7 ) ) ;
    public final void rule__ArcoTL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( rule__ArcoTL__DestinoAssignment_7 ) ) )
            // InternalMyDsl.g:1611:1: ( ( rule__ArcoTL__DestinoAssignment_7 ) )
            {
            // InternalMyDsl.g:1611:1: ( ( rule__ArcoTL__DestinoAssignment_7 ) )
            // InternalMyDsl.g:1612:2: ( rule__ArcoTL__DestinoAssignment_7 )
            {
             before(grammarAccess.getArcoTLAccess().getDestinoAssignment_7()); 
            // InternalMyDsl.g:1613:2: ( rule__ArcoTL__DestinoAssignment_7 )
            // InternalMyDsl.g:1613:3: rule__ArcoTL__DestinoAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ArcoTL__DestinoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getArcoTLAccess().getDestinoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__7__Impl"


    // $ANTLR start "rule__ArcoTL__Group__8"
    // InternalMyDsl.g:1621:1: rule__ArcoTL__Group__8 : rule__ArcoTL__Group__8__Impl ;
    public final void rule__ArcoTL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__ArcoTL__Group__8__Impl )
            // InternalMyDsl.g:1626:2: rule__ArcoTL__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArcoTL__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__8"


    // $ANTLR start "rule__ArcoTL__Group__8__Impl"
    // InternalMyDsl.g:1632:1: rule__ArcoTL__Group__8__Impl : ( '}' ) ;
    public final void rule__ArcoTL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( '}' ) )
            // InternalMyDsl.g:1637:1: ( '}' )
            {
            // InternalMyDsl.g:1637:1: ( '}' )
            // InternalMyDsl.g:1638:2: '}'
            {
             before(grammarAccess.getArcoTLAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArcoTLAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__Group__8__Impl"


    // $ANTLR start "rule__ArcoLT__Group__0"
    // InternalMyDsl.g:1648:1: rule__ArcoLT__Group__0 : rule__ArcoLT__Group__0__Impl rule__ArcoLT__Group__1 ;
    public final void rule__ArcoLT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__ArcoLT__Group__0__Impl rule__ArcoLT__Group__1 )
            // InternalMyDsl.g:1653:2: rule__ArcoLT__Group__0__Impl rule__ArcoLT__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArcoLT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__0"


    // $ANTLR start "rule__ArcoLT__Group__0__Impl"
    // InternalMyDsl.g:1660:1: rule__ArcoLT__Group__0__Impl : ( 'ArcoLT' ) ;
    public final void rule__ArcoLT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( 'ArcoLT' ) )
            // InternalMyDsl.g:1665:1: ( 'ArcoLT' )
            {
            // InternalMyDsl.g:1665:1: ( 'ArcoLT' )
            // InternalMyDsl.g:1666:2: 'ArcoLT'
            {
             before(grammarAccess.getArcoLTAccess().getArcoLTKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getArcoLTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__0__Impl"


    // $ANTLR start "rule__ArcoLT__Group__1"
    // InternalMyDsl.g:1675:1: rule__ArcoLT__Group__1 : rule__ArcoLT__Group__1__Impl rule__ArcoLT__Group__2 ;
    public final void rule__ArcoLT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__ArcoLT__Group__1__Impl rule__ArcoLT__Group__2 )
            // InternalMyDsl.g:1680:2: rule__ArcoLT__Group__1__Impl rule__ArcoLT__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ArcoLT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__1"


    // $ANTLR start "rule__ArcoLT__Group__1__Impl"
    // InternalMyDsl.g:1687:1: rule__ArcoLT__Group__1__Impl : ( '{' ) ;
    public final void rule__ArcoLT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( '{' ) )
            // InternalMyDsl.g:1692:1: ( '{' )
            {
            // InternalMyDsl.g:1692:1: ( '{' )
            // InternalMyDsl.g:1693:2: '{'
            {
             before(grammarAccess.getArcoLTAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__1__Impl"


    // $ANTLR start "rule__ArcoLT__Group__2"
    // InternalMyDsl.g:1702:1: rule__ArcoLT__Group__2 : rule__ArcoLT__Group__2__Impl rule__ArcoLT__Group__3 ;
    public final void rule__ArcoLT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__ArcoLT__Group__2__Impl rule__ArcoLT__Group__3 )
            // InternalMyDsl.g:1707:2: rule__ArcoLT__Group__2__Impl rule__ArcoLT__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ArcoLT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__2"


    // $ANTLR start "rule__ArcoLT__Group__2__Impl"
    // InternalMyDsl.g:1714:1: rule__ArcoLT__Group__2__Impl : ( 'peso' ) ;
    public final void rule__ArcoLT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( 'peso' ) )
            // InternalMyDsl.g:1719:1: ( 'peso' )
            {
            // InternalMyDsl.g:1719:1: ( 'peso' )
            // InternalMyDsl.g:1720:2: 'peso'
            {
             before(grammarAccess.getArcoLTAccess().getPesoKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getPesoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__2__Impl"


    // $ANTLR start "rule__ArcoLT__Group__3"
    // InternalMyDsl.g:1729:1: rule__ArcoLT__Group__3 : rule__ArcoLT__Group__3__Impl rule__ArcoLT__Group__4 ;
    public final void rule__ArcoLT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__ArcoLT__Group__3__Impl rule__ArcoLT__Group__4 )
            // InternalMyDsl.g:1734:2: rule__ArcoLT__Group__3__Impl rule__ArcoLT__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ArcoLT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__3"


    // $ANTLR start "rule__ArcoLT__Group__3__Impl"
    // InternalMyDsl.g:1741:1: rule__ArcoLT__Group__3__Impl : ( ( rule__ArcoLT__PesoAssignment_3 ) ) ;
    public final void rule__ArcoLT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__ArcoLT__PesoAssignment_3 ) ) )
            // InternalMyDsl.g:1746:1: ( ( rule__ArcoLT__PesoAssignment_3 ) )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__ArcoLT__PesoAssignment_3 ) )
            // InternalMyDsl.g:1747:2: ( rule__ArcoLT__PesoAssignment_3 )
            {
             before(grammarAccess.getArcoLTAccess().getPesoAssignment_3()); 
            // InternalMyDsl.g:1748:2: ( rule__ArcoLT__PesoAssignment_3 )
            // InternalMyDsl.g:1748:3: rule__ArcoLT__PesoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArcoLT__PesoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArcoLTAccess().getPesoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__3__Impl"


    // $ANTLR start "rule__ArcoLT__Group__4"
    // InternalMyDsl.g:1756:1: rule__ArcoLT__Group__4 : rule__ArcoLT__Group__4__Impl rule__ArcoLT__Group__5 ;
    public final void rule__ArcoLT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__ArcoLT__Group__4__Impl rule__ArcoLT__Group__5 )
            // InternalMyDsl.g:1761:2: rule__ArcoLT__Group__4__Impl rule__ArcoLT__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ArcoLT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__4"


    // $ANTLR start "rule__ArcoLT__Group__4__Impl"
    // InternalMyDsl.g:1768:1: rule__ArcoLT__Group__4__Impl : ( 'origen' ) ;
    public final void rule__ArcoLT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( 'origen' ) )
            // InternalMyDsl.g:1773:1: ( 'origen' )
            {
            // InternalMyDsl.g:1773:1: ( 'origen' )
            // InternalMyDsl.g:1774:2: 'origen'
            {
             before(grammarAccess.getArcoLTAccess().getOrigenKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getOrigenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__4__Impl"


    // $ANTLR start "rule__ArcoLT__Group__5"
    // InternalMyDsl.g:1783:1: rule__ArcoLT__Group__5 : rule__ArcoLT__Group__5__Impl rule__ArcoLT__Group__6 ;
    public final void rule__ArcoLT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__ArcoLT__Group__5__Impl rule__ArcoLT__Group__6 )
            // InternalMyDsl.g:1788:2: rule__ArcoLT__Group__5__Impl rule__ArcoLT__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ArcoLT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__5"


    // $ANTLR start "rule__ArcoLT__Group__5__Impl"
    // InternalMyDsl.g:1795:1: rule__ArcoLT__Group__5__Impl : ( ( rule__ArcoLT__OrigenAssignment_5 ) ) ;
    public final void rule__ArcoLT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( ( rule__ArcoLT__OrigenAssignment_5 ) ) )
            // InternalMyDsl.g:1800:1: ( ( rule__ArcoLT__OrigenAssignment_5 ) )
            {
            // InternalMyDsl.g:1800:1: ( ( rule__ArcoLT__OrigenAssignment_5 ) )
            // InternalMyDsl.g:1801:2: ( rule__ArcoLT__OrigenAssignment_5 )
            {
             before(grammarAccess.getArcoLTAccess().getOrigenAssignment_5()); 
            // InternalMyDsl.g:1802:2: ( rule__ArcoLT__OrigenAssignment_5 )
            // InternalMyDsl.g:1802:3: rule__ArcoLT__OrigenAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ArcoLT__OrigenAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArcoLTAccess().getOrigenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__5__Impl"


    // $ANTLR start "rule__ArcoLT__Group__6"
    // InternalMyDsl.g:1810:1: rule__ArcoLT__Group__6 : rule__ArcoLT__Group__6__Impl rule__ArcoLT__Group__7 ;
    public final void rule__ArcoLT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__ArcoLT__Group__6__Impl rule__ArcoLT__Group__7 )
            // InternalMyDsl.g:1815:2: rule__ArcoLT__Group__6__Impl rule__ArcoLT__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ArcoLT__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__6"


    // $ANTLR start "rule__ArcoLT__Group__6__Impl"
    // InternalMyDsl.g:1822:1: rule__ArcoLT__Group__6__Impl : ( 'destino' ) ;
    public final void rule__ArcoLT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( 'destino' ) )
            // InternalMyDsl.g:1827:1: ( 'destino' )
            {
            // InternalMyDsl.g:1827:1: ( 'destino' )
            // InternalMyDsl.g:1828:2: 'destino'
            {
             before(grammarAccess.getArcoLTAccess().getDestinoKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getDestinoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__6__Impl"


    // $ANTLR start "rule__ArcoLT__Group__7"
    // InternalMyDsl.g:1837:1: rule__ArcoLT__Group__7 : rule__ArcoLT__Group__7__Impl rule__ArcoLT__Group__8 ;
    public final void rule__ArcoLT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__ArcoLT__Group__7__Impl rule__ArcoLT__Group__8 )
            // InternalMyDsl.g:1842:2: rule__ArcoLT__Group__7__Impl rule__ArcoLT__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ArcoLT__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__7"


    // $ANTLR start "rule__ArcoLT__Group__7__Impl"
    // InternalMyDsl.g:1849:1: rule__ArcoLT__Group__7__Impl : ( ( rule__ArcoLT__DestinoAssignment_7 ) ) ;
    public final void rule__ArcoLT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ( rule__ArcoLT__DestinoAssignment_7 ) ) )
            // InternalMyDsl.g:1854:1: ( ( rule__ArcoLT__DestinoAssignment_7 ) )
            {
            // InternalMyDsl.g:1854:1: ( ( rule__ArcoLT__DestinoAssignment_7 ) )
            // InternalMyDsl.g:1855:2: ( rule__ArcoLT__DestinoAssignment_7 )
            {
             before(grammarAccess.getArcoLTAccess().getDestinoAssignment_7()); 
            // InternalMyDsl.g:1856:2: ( rule__ArcoLT__DestinoAssignment_7 )
            // InternalMyDsl.g:1856:3: rule__ArcoLT__DestinoAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ArcoLT__DestinoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getArcoLTAccess().getDestinoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__7__Impl"


    // $ANTLR start "rule__ArcoLT__Group__8"
    // InternalMyDsl.g:1864:1: rule__ArcoLT__Group__8 : rule__ArcoLT__Group__8__Impl ;
    public final void rule__ArcoLT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__ArcoLT__Group__8__Impl )
            // InternalMyDsl.g:1869:2: rule__ArcoLT__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArcoLT__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__8"


    // $ANTLR start "rule__ArcoLT__Group__8__Impl"
    // InternalMyDsl.g:1875:1: rule__ArcoLT__Group__8__Impl : ( '}' ) ;
    public final void rule__ArcoLT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( '}' ) )
            // InternalMyDsl.g:1880:1: ( '}' )
            {
            // InternalMyDsl.g:1880:1: ( '}' )
            // InternalMyDsl.g:1881:2: '}'
            {
             before(grammarAccess.getArcoLTAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArcoLTAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__Group__8__Impl"


    // $ANTLR start "rule__RdP__TransicionesAssignment_4"
    // InternalMyDsl.g:1891:1: rule__RdP__TransicionesAssignment_4 : ( ruleTransicion ) ;
    public final void rule__RdP__TransicionesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( ruleTransicion ) )
            // InternalMyDsl.g:1896:2: ( ruleTransicion )
            {
            // InternalMyDsl.g:1896:2: ( ruleTransicion )
            // InternalMyDsl.g:1897:3: ruleTransicion
            {
             before(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransicion();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__TransicionesAssignment_4"


    // $ANTLR start "rule__RdP__TransicionesAssignment_5_1"
    // InternalMyDsl.g:1906:1: rule__RdP__TransicionesAssignment_5_1 : ( ruleTransicion ) ;
    public final void rule__RdP__TransicionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( ( ruleTransicion ) )
            // InternalMyDsl.g:1911:2: ( ruleTransicion )
            {
            // InternalMyDsl.g:1911:2: ( ruleTransicion )
            // InternalMyDsl.g:1912:3: ruleTransicion
            {
             before(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransicion();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__TransicionesAssignment_5_1"


    // $ANTLR start "rule__RdP__LugaresAssignment_9"
    // InternalMyDsl.g:1921:1: rule__RdP__LugaresAssignment_9 : ( ruleLugar ) ;
    public final void rule__RdP__LugaresAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( ruleLugar ) )
            // InternalMyDsl.g:1926:2: ( ruleLugar )
            {
            // InternalMyDsl.g:1926:2: ( ruleLugar )
            // InternalMyDsl.g:1927:3: ruleLugar
            {
             before(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleLugar();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__LugaresAssignment_9"


    // $ANTLR start "rule__RdP__LugaresAssignment_10_1"
    // InternalMyDsl.g:1936:1: rule__RdP__LugaresAssignment_10_1 : ( ruleLugar ) ;
    public final void rule__RdP__LugaresAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( ruleLugar ) )
            // InternalMyDsl.g:1941:2: ( ruleLugar )
            {
            // InternalMyDsl.g:1941:2: ( ruleLugar )
            // InternalMyDsl.g:1942:3: ruleLugar
            {
             before(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLugar();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__LugaresAssignment_10_1"


    // $ANTLR start "rule__RdP__ArcosAssignment_14"
    // InternalMyDsl.g:1951:1: rule__RdP__ArcosAssignment_14 : ( ruleArco ) ;
    public final void rule__RdP__ArcosAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( ( ruleArco ) )
            // InternalMyDsl.g:1956:2: ( ruleArco )
            {
            // InternalMyDsl.g:1956:2: ( ruleArco )
            // InternalMyDsl.g:1957:3: ruleArco
            {
             before(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleArco();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__ArcosAssignment_14"


    // $ANTLR start "rule__RdP__ArcosAssignment_15_1"
    // InternalMyDsl.g:1966:1: rule__RdP__ArcosAssignment_15_1 : ( ruleArco ) ;
    public final void rule__RdP__ArcosAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ruleArco ) )
            // InternalMyDsl.g:1971:2: ( ruleArco )
            {
            // InternalMyDsl.g:1971:2: ( ruleArco )
            // InternalMyDsl.g:1972:3: ruleArco
            {
             before(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArco();

            state._fsp--;

             after(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdP__ArcosAssignment_15_1"


    // $ANTLR start "rule__Transicion__NameAssignment_2"
    // InternalMyDsl.g:1981:1: rule__Transicion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Transicion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1986:2: ( ruleEString )
            {
            // InternalMyDsl.g:1986:2: ( ruleEString )
            // InternalMyDsl.g:1987:3: ruleEString
            {
             before(grammarAccess.getTransicionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransicionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transicion__NameAssignment_2"


    // $ANTLR start "rule__Lugar__NameAssignment_1"
    // InternalMyDsl.g:1996:1: rule__Lugar__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Lugar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2001:2: ( ruleEString )
            {
            // InternalMyDsl.g:2001:2: ( ruleEString )
            // InternalMyDsl.g:2002:3: ruleEString
            {
             before(grammarAccess.getLugarAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLugarAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__NameAssignment_1"


    // $ANTLR start "rule__Lugar__MarcaAssignment_4"
    // InternalMyDsl.g:2011:1: rule__Lugar__MarcaAssignment_4 : ( ruleEInt ) ;
    public final void rule__Lugar__MarcaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2016:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2016:2: ( ruleEInt )
            // InternalMyDsl.g:2017:3: ruleEInt
            {
             before(grammarAccess.getLugarAccess().getMarcaEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLugarAccess().getMarcaEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lugar__MarcaAssignment_4"


    // $ANTLR start "rule__Arco_Impl__PesoAssignment_3"
    // InternalMyDsl.g:2026:1: rule__Arco_Impl__PesoAssignment_3 : ( ruleEInt ) ;
    public final void rule__Arco_Impl__PesoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2031:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2031:2: ( ruleEInt )
            // InternalMyDsl.g:2032:3: ruleEInt
            {
             before(grammarAccess.getArco_ImplAccess().getPesoEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArco_ImplAccess().getPesoEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arco_Impl__PesoAssignment_3"


    // $ANTLR start "rule__ArcoTL__PesoAssignment_3"
    // InternalMyDsl.g:2041:1: rule__ArcoTL__PesoAssignment_3 : ( ruleEInt ) ;
    public final void rule__ArcoTL__PesoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2046:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2046:2: ( ruleEInt )
            // InternalMyDsl.g:2047:3: ruleEInt
            {
             before(grammarAccess.getArcoTLAccess().getPesoEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArcoTLAccess().getPesoEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__PesoAssignment_3"


    // $ANTLR start "rule__ArcoTL__OrigenAssignment_5"
    // InternalMyDsl.g:2056:1: rule__ArcoTL__OrigenAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ArcoTL__OrigenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2061:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2061:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2062:3: ( ruleEString )
            {
             before(grammarAccess.getArcoTLAccess().getOrigenTransicionCrossReference_5_0()); 
            // InternalMyDsl.g:2063:3: ( ruleEString )
            // InternalMyDsl.g:2064:4: ruleEString
            {
             before(grammarAccess.getArcoTLAccess().getOrigenTransicionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcoTLAccess().getOrigenTransicionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getArcoTLAccess().getOrigenTransicionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__OrigenAssignment_5"


    // $ANTLR start "rule__ArcoTL__DestinoAssignment_7"
    // InternalMyDsl.g:2075:1: rule__ArcoTL__DestinoAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ArcoTL__DestinoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2080:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2080:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2081:3: ( ruleEString )
            {
             before(grammarAccess.getArcoTLAccess().getDestinoLugarCrossReference_7_0()); 
            // InternalMyDsl.g:2082:3: ( ruleEString )
            // InternalMyDsl.g:2083:4: ruleEString
            {
             before(grammarAccess.getArcoTLAccess().getDestinoLugarEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcoTLAccess().getDestinoLugarEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getArcoTLAccess().getDestinoLugarCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoTL__DestinoAssignment_7"


    // $ANTLR start "rule__ArcoLT__PesoAssignment_3"
    // InternalMyDsl.g:2094:1: rule__ArcoLT__PesoAssignment_3 : ( ruleEInt ) ;
    public final void rule__ArcoLT__PesoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2099:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2099:2: ( ruleEInt )
            // InternalMyDsl.g:2100:3: ruleEInt
            {
             before(grammarAccess.getArcoLTAccess().getPesoEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArcoLTAccess().getPesoEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__PesoAssignment_3"


    // $ANTLR start "rule__ArcoLT__OrigenAssignment_5"
    // InternalMyDsl.g:2109:1: rule__ArcoLT__OrigenAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ArcoLT__OrigenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2114:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2114:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2115:3: ( ruleEString )
            {
             before(grammarAccess.getArcoLTAccess().getOrigenLugarCrossReference_5_0()); 
            // InternalMyDsl.g:2116:3: ( ruleEString )
            // InternalMyDsl.g:2117:4: ruleEString
            {
             before(grammarAccess.getArcoLTAccess().getOrigenLugarEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcoLTAccess().getOrigenLugarEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getArcoLTAccess().getOrigenLugarCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__OrigenAssignment_5"


    // $ANTLR start "rule__ArcoLT__DestinoAssignment_7"
    // InternalMyDsl.g:2128:1: rule__ArcoLT__DestinoAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ArcoLT__DestinoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2133:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2133:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2134:3: ( ruleEString )
            {
             before(grammarAccess.getArcoLTAccess().getDestinoTransicionCrossReference_7_0()); 
            // InternalMyDsl.g:2135:3: ( ruleEString )
            // InternalMyDsl.g:2136:4: ruleEString
            {
             before(grammarAccess.getArcoLTAccess().getDestinoTransicionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcoLTAccess().getDestinoTransicionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getArcoLTAccess().getDestinoTransicionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcoLT__DestinoAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000009200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}