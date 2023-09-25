package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RdP'", "'{'", "'transiciones'", "','", "'}'", "'lugares'", "'arcos'", "'Transicion'", "'Lugar'", "'marca'", "'Arco'", "'peso'", "'-'", "'ArcoTL'", "'origen'", "'destino'", "'ArcoLT'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RdP";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRdP"
    // InternalMyDsl.g:64:1: entryRuleRdP returns [EObject current=null] : iv_ruleRdP= ruleRdP EOF ;
    public final EObject entryRuleRdP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdP = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleRdP= ruleRdP EOF )
            // InternalMyDsl.g:65:2: iv_ruleRdP= ruleRdP EOF
            {
             newCompositeNode(grammarAccess.getRdPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRdP=ruleRdP();

            state._fsp--;

             current =iv_ruleRdP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRdP"


    // $ANTLR start "ruleRdP"
    // InternalMyDsl.g:71:1: ruleRdP returns [EObject current=null] : (otherlv_0= 'RdP' otherlv_1= '{' otherlv_2= 'transiciones' otherlv_3= '{' ( (lv_transiciones_4_0= ruleTransicion ) ) (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )* otherlv_7= '}' otherlv_8= 'lugares' otherlv_9= '{' ( (lv_lugares_10_0= ruleLugar ) ) (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )* otherlv_13= '}' otherlv_14= 'arcos' otherlv_15= '{' ( (lv_arcos_16_0= ruleArco ) ) (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleRdP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_transiciones_4_0 = null;

        EObject lv_transiciones_6_0 = null;

        EObject lv_lugares_10_0 = null;

        EObject lv_lugares_12_0 = null;

        EObject lv_arcos_16_0 = null;

        EObject lv_arcos_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'RdP' otherlv_1= '{' otherlv_2= 'transiciones' otherlv_3= '{' ( (lv_transiciones_4_0= ruleTransicion ) ) (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )* otherlv_7= '}' otherlv_8= 'lugares' otherlv_9= '{' ( (lv_lugares_10_0= ruleLugar ) ) (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )* otherlv_13= '}' otherlv_14= 'arcos' otherlv_15= '{' ( (lv_arcos_16_0= ruleArco ) ) (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'RdP' otherlv_1= '{' otherlv_2= 'transiciones' otherlv_3= '{' ( (lv_transiciones_4_0= ruleTransicion ) ) (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )* otherlv_7= '}' otherlv_8= 'lugares' otherlv_9= '{' ( (lv_lugares_10_0= ruleLugar ) ) (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )* otherlv_13= '}' otherlv_14= 'arcos' otherlv_15= '{' ( (lv_arcos_16_0= ruleArco ) ) (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'RdP' otherlv_1= '{' otherlv_2= 'transiciones' otherlv_3= '{' ( (lv_transiciones_4_0= ruleTransicion ) ) (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )* otherlv_7= '}' otherlv_8= 'lugares' otherlv_9= '{' ( (lv_lugares_10_0= ruleLugar ) ) (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )* otherlv_13= '}' otherlv_14= 'arcos' otherlv_15= '{' ( (lv_arcos_16_0= ruleArco ) ) (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )* otherlv_19= '}' otherlv_20= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'RdP' otherlv_1= '{' otherlv_2= 'transiciones' otherlv_3= '{' ( (lv_transiciones_4_0= ruleTransicion ) ) (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )* otherlv_7= '}' otherlv_8= 'lugares' otherlv_9= '{' ( (lv_lugares_10_0= ruleLugar ) ) (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )* otherlv_13= '}' otherlv_14= 'arcos' otherlv_15= '{' ( (lv_arcos_16_0= ruleArco ) ) (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )* otherlv_19= '}' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRdPAccess().getRdPKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRdPAccess().getTransicionesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:95:3: ( (lv_transiciones_4_0= ruleTransicion ) )
            // InternalMyDsl.g:96:4: (lv_transiciones_4_0= ruleTransicion )
            {
            // InternalMyDsl.g:96:4: (lv_transiciones_4_0= ruleTransicion )
            // InternalMyDsl.g:97:5: lv_transiciones_4_0= ruleTransicion
            {

            					newCompositeNode(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_transiciones_4_0=ruleTransicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRdPRule());
            					}
            					add(
            						current,
            						"transiciones",
            						lv_transiciones_4_0,
            						"org.xtext.example.mydsl.MyDsl.Transicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:114:3: (otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:115:4: otherlv_5= ',' ( (lv_transiciones_6_0= ruleTransicion ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRdPAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:119:4: ( (lv_transiciones_6_0= ruleTransicion ) )
            	    // InternalMyDsl.g:120:5: (lv_transiciones_6_0= ruleTransicion )
            	    {
            	    // InternalMyDsl.g:120:5: (lv_transiciones_6_0= ruleTransicion )
            	    // InternalMyDsl.g:121:6: lv_transiciones_6_0= ruleTransicion
            	    {

            	    						newCompositeNode(grammarAccess.getRdPAccess().getTransicionesTransicionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transiciones_6_0=ruleTransicion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRdPRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transiciones",
            	    							lv_transiciones_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Transicion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRdPAccess().getLugaresKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:151:3: ( (lv_lugares_10_0= ruleLugar ) )
            // InternalMyDsl.g:152:4: (lv_lugares_10_0= ruleLugar )
            {
            // InternalMyDsl.g:152:4: (lv_lugares_10_0= ruleLugar )
            // InternalMyDsl.g:153:5: lv_lugares_10_0= ruleLugar
            {

            					newCompositeNode(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_lugares_10_0=ruleLugar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRdPRule());
            					}
            					add(
            						current,
            						"lugares",
            						lv_lugares_10_0,
            						"org.xtext.example.mydsl.MyDsl.Lugar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:170:3: (otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:171:4: otherlv_11= ',' ( (lv_lugares_12_0= ruleLugar ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getRdPAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMyDsl.g:175:4: ( (lv_lugares_12_0= ruleLugar ) )
            	    // InternalMyDsl.g:176:5: (lv_lugares_12_0= ruleLugar )
            	    {
            	    // InternalMyDsl.g:176:5: (lv_lugares_12_0= ruleLugar )
            	    // InternalMyDsl.g:177:6: lv_lugares_12_0= ruleLugar
            	    {

            	    						newCompositeNode(grammarAccess.getRdPAccess().getLugaresLugarParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_lugares_12_0=ruleLugar();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRdPRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lugares",
            	    							lv_lugares_12_0,
            	    							"org.xtext.example.mydsl.MyDsl.Lugar");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getRdPAccess().getArcosKeyword_12());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getRdPAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMyDsl.g:207:3: ( (lv_arcos_16_0= ruleArco ) )
            // InternalMyDsl.g:208:4: (lv_arcos_16_0= ruleArco )
            {
            // InternalMyDsl.g:208:4: (lv_arcos_16_0= ruleArco )
            // InternalMyDsl.g:209:5: lv_arcos_16_0= ruleArco
            {

            					newCompositeNode(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_arcos_16_0=ruleArco();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRdPRule());
            					}
            					add(
            						current,
            						"arcos",
            						lv_arcos_16_0,
            						"org.xtext.example.mydsl.MyDsl.Arco");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:226:3: (otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:227:4: otherlv_17= ',' ( (lv_arcos_18_0= ruleArco ) )
            	    {
            	    otherlv_17=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_17, grammarAccess.getRdPAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMyDsl.g:231:4: ( (lv_arcos_18_0= ruleArco ) )
            	    // InternalMyDsl.g:232:5: (lv_arcos_18_0= ruleArco )
            	    {
            	    // InternalMyDsl.g:232:5: (lv_arcos_18_0= ruleArco )
            	    // InternalMyDsl.g:233:6: lv_arcos_18_0= ruleArco
            	    {

            	    						newCompositeNode(grammarAccess.getRdPAccess().getArcosArcoParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_arcos_18_0=ruleArco();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRdPRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arcos",
            	    							lv_arcos_18_0,
            	    							"org.xtext.example.mydsl.MyDsl.Arco");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_19=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_19, grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRdPAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRdP"


    // $ANTLR start "entryRuleArco"
    // InternalMyDsl.g:263:1: entryRuleArco returns [EObject current=null] : iv_ruleArco= ruleArco EOF ;
    public final EObject entryRuleArco() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArco = null;


        try {
            // InternalMyDsl.g:263:45: (iv_ruleArco= ruleArco EOF )
            // InternalMyDsl.g:264:2: iv_ruleArco= ruleArco EOF
            {
             newCompositeNode(grammarAccess.getArcoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArco=ruleArco();

            state._fsp--;

             current =iv_ruleArco; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArco"


    // $ANTLR start "ruleArco"
    // InternalMyDsl.g:270:1: ruleArco returns [EObject current=null] : (this_Arco_Impl_0= ruleArco_Impl | this_ArcoTL_1= ruleArcoTL | this_ArcoLT_2= ruleArcoLT ) ;
    public final EObject ruleArco() throws RecognitionException {
        EObject current = null;

        EObject this_Arco_Impl_0 = null;

        EObject this_ArcoTL_1 = null;

        EObject this_ArcoLT_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( (this_Arco_Impl_0= ruleArco_Impl | this_ArcoTL_1= ruleArcoTL | this_ArcoLT_2= ruleArcoLT ) )
            // InternalMyDsl.g:277:2: (this_Arco_Impl_0= ruleArco_Impl | this_ArcoTL_1= ruleArcoTL | this_ArcoLT_2= ruleArcoLT )
            {
            // InternalMyDsl.g:277:2: (this_Arco_Impl_0= ruleArco_Impl | this_ArcoTL_1= ruleArcoTL | this_ArcoLT_2= ruleArcoLT )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:278:3: this_Arco_Impl_0= ruleArco_Impl
                    {

                    			newCompositeNode(grammarAccess.getArcoAccess().getArco_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arco_Impl_0=ruleArco_Impl();

                    state._fsp--;


                    			current = this_Arco_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:3: this_ArcoTL_1= ruleArcoTL
                    {

                    			newCompositeNode(grammarAccess.getArcoAccess().getArcoTLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArcoTL_1=ruleArcoTL();

                    state._fsp--;


                    			current = this_ArcoTL_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:296:3: this_ArcoLT_2= ruleArcoLT
                    {

                    			newCompositeNode(grammarAccess.getArcoAccess().getArcoLTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArcoLT_2=ruleArcoLT();

                    state._fsp--;


                    			current = this_ArcoLT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArco"


    // $ANTLR start "entryRuleTransicion"
    // InternalMyDsl.g:308:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // InternalMyDsl.g:308:51: (iv_ruleTransicion= ruleTransicion EOF )
            // InternalMyDsl.g:309:2: iv_ruleTransicion= ruleTransicion EOF
            {
             newCompositeNode(grammarAccess.getTransicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransicion=ruleTransicion();

            state._fsp--;

             current =iv_ruleTransicion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransicion"


    // $ANTLR start "ruleTransicion"
    // InternalMyDsl.g:315:1: ruleTransicion returns [EObject current=null] : ( () otherlv_1= 'Transicion' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:321:2: ( ( () otherlv_1= 'Transicion' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:322:2: ( () otherlv_1= 'Transicion' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:322:2: ( () otherlv_1= 'Transicion' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:323:3: () otherlv_1= 'Transicion' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:323:3: ()
            // InternalMyDsl.g:324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransicionAccess().getTransicionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getTransicionKeyword_1());
            		
            // InternalMyDsl.g:334:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:335:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:335:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:336:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransicionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransicionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransicion"


    // $ANTLR start "entryRuleLugar"
    // InternalMyDsl.g:357:1: entryRuleLugar returns [EObject current=null] : iv_ruleLugar= ruleLugar EOF ;
    public final EObject entryRuleLugar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLugar = null;


        try {
            // InternalMyDsl.g:357:46: (iv_ruleLugar= ruleLugar EOF )
            // InternalMyDsl.g:358:2: iv_ruleLugar= ruleLugar EOF
            {
             newCompositeNode(grammarAccess.getLugarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLugar=ruleLugar();

            state._fsp--;

             current =iv_ruleLugar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLugar"


    // $ANTLR start "ruleLugar"
    // InternalMyDsl.g:364:1: ruleLugar returns [EObject current=null] : (otherlv_0= 'Lugar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'marca' ( (lv_marca_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleLugar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_marca_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (otherlv_0= 'Lugar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'marca' ( (lv_marca_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:371:2: (otherlv_0= 'Lugar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'marca' ( (lv_marca_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:371:2: (otherlv_0= 'Lugar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'marca' ( (lv_marca_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalMyDsl.g:372:3: otherlv_0= 'Lugar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'marca' ( (lv_marca_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLugarAccess().getLugarKeyword_0());
            		
            // InternalMyDsl.g:376:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:377:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:377:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:378:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLugarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLugarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLugarAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLugarAccess().getMarcaKeyword_3());
            		
            // InternalMyDsl.g:403:3: ( (lv_marca_4_0= ruleEInt ) )
            // InternalMyDsl.g:404:4: (lv_marca_4_0= ruleEInt )
            {
            // InternalMyDsl.g:404:4: (lv_marca_4_0= ruleEInt )
            // InternalMyDsl.g:405:5: lv_marca_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLugarAccess().getMarcaEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_marca_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLugarRule());
            					}
            					set(
            						current,
            						"marca",
            						lv_marca_4_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLugarAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLugar"


    // $ANTLR start "entryRuleArco_Impl"
    // InternalMyDsl.g:430:1: entryRuleArco_Impl returns [EObject current=null] : iv_ruleArco_Impl= ruleArco_Impl EOF ;
    public final EObject entryRuleArco_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArco_Impl = null;


        try {
            // InternalMyDsl.g:430:50: (iv_ruleArco_Impl= ruleArco_Impl EOF )
            // InternalMyDsl.g:431:2: iv_ruleArco_Impl= ruleArco_Impl EOF
            {
             newCompositeNode(grammarAccess.getArco_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArco_Impl=ruleArco_Impl();

            state._fsp--;

             current =iv_ruleArco_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArco_Impl"


    // $ANTLR start "ruleArco_Impl"
    // InternalMyDsl.g:437:1: ruleArco_Impl returns [EObject current=null] : (otherlv_0= 'Arco' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleArco_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_peso_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:443:2: ( (otherlv_0= 'Arco' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:444:2: (otherlv_0= 'Arco' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:444:2: (otherlv_0= 'Arco' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalMyDsl.g:445:3: otherlv_0= 'Arco' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArco_ImplAccess().getArcoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getArco_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getArco_ImplAccess().getPesoKeyword_2());
            		
            // InternalMyDsl.g:457:3: ( (lv_peso_3_0= ruleEInt ) )
            // InternalMyDsl.g:458:4: (lv_peso_3_0= ruleEInt )
            {
            // InternalMyDsl.g:458:4: (lv_peso_3_0= ruleEInt )
            // InternalMyDsl.g:459:5: lv_peso_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getArco_ImplAccess().getPesoEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_peso_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArco_ImplRule());
            					}
            					set(
            						current,
            						"peso",
            						lv_peso_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArco_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArco_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:484:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:484:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:485:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:491:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:497:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:499:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:507:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:518:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:518:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:519:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:525:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:531:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:532:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:532:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:533:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:533:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:534:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleArcoTL"
    // InternalMyDsl.g:551:1: entryRuleArcoTL returns [EObject current=null] : iv_ruleArcoTL= ruleArcoTL EOF ;
    public final EObject entryRuleArcoTL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArcoTL = null;


        try {
            // InternalMyDsl.g:551:47: (iv_ruleArcoTL= ruleArcoTL EOF )
            // InternalMyDsl.g:552:2: iv_ruleArcoTL= ruleArcoTL EOF
            {
             newCompositeNode(grammarAccess.getArcoTLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArcoTL=ruleArcoTL();

            state._fsp--;

             current =iv_ruleArcoTL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArcoTL"


    // $ANTLR start "ruleArcoTL"
    // InternalMyDsl.g:558:1: ruleArcoTL returns [EObject current=null] : (otherlv_0= 'ArcoTL' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleArcoTL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_peso_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( (otherlv_0= 'ArcoTL' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:565:2: (otherlv_0= 'ArcoTL' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:565:2: (otherlv_0= 'ArcoTL' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:566:3: otherlv_0= 'ArcoTL' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArcoTLAccess().getArcoTLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getArcoTLAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getArcoTLAccess().getPesoKeyword_2());
            		
            // InternalMyDsl.g:578:3: ( (lv_peso_3_0= ruleEInt ) )
            // InternalMyDsl.g:579:4: (lv_peso_3_0= ruleEInt )
            {
            // InternalMyDsl.g:579:4: (lv_peso_3_0= ruleEInt )
            // InternalMyDsl.g:580:5: lv_peso_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getArcoTLAccess().getPesoEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_peso_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArcoTLRule());
            					}
            					set(
            						current,
            						"peso",
            						lv_peso_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getArcoTLAccess().getOrigenKeyword_4());
            		
            // InternalMyDsl.g:601:3: ( ( ruleEString ) )
            // InternalMyDsl.g:602:4: ( ruleEString )
            {
            // InternalMyDsl.g:602:4: ( ruleEString )
            // InternalMyDsl.g:603:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcoTLRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcoTLAccess().getOrigenTransicionCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getArcoTLAccess().getDestinoKeyword_6());
            		
            // InternalMyDsl.g:621:3: ( ( ruleEString ) )
            // InternalMyDsl.g:622:4: ( ruleEString )
            {
            // InternalMyDsl.g:622:4: ( ruleEString )
            // InternalMyDsl.g:623:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcoTLRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcoTLAccess().getDestinoLugarCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getArcoTLAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArcoTL"


    // $ANTLR start "entryRuleArcoLT"
    // InternalMyDsl.g:645:1: entryRuleArcoLT returns [EObject current=null] : iv_ruleArcoLT= ruleArcoLT EOF ;
    public final EObject entryRuleArcoLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArcoLT = null;


        try {
            // InternalMyDsl.g:645:47: (iv_ruleArcoLT= ruleArcoLT EOF )
            // InternalMyDsl.g:646:2: iv_ruleArcoLT= ruleArcoLT EOF
            {
             newCompositeNode(grammarAccess.getArcoLTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArcoLT=ruleArcoLT();

            state._fsp--;

             current =iv_ruleArcoLT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArcoLT"


    // $ANTLR start "ruleArcoLT"
    // InternalMyDsl.g:652:1: ruleArcoLT returns [EObject current=null] : (otherlv_0= 'ArcoLT' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleArcoLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_peso_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:658:2: ( (otherlv_0= 'ArcoLT' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:659:2: (otherlv_0= 'ArcoLT' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:659:2: (otherlv_0= 'ArcoLT' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:660:3: otherlv_0= 'ArcoLT' otherlv_1= '{' otherlv_2= 'peso' ( (lv_peso_3_0= ruleEInt ) ) otherlv_4= 'origen' ( ( ruleEString ) ) otherlv_6= 'destino' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArcoLTAccess().getArcoLTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getArcoLTAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getArcoLTAccess().getPesoKeyword_2());
            		
            // InternalMyDsl.g:672:3: ( (lv_peso_3_0= ruleEInt ) )
            // InternalMyDsl.g:673:4: (lv_peso_3_0= ruleEInt )
            {
            // InternalMyDsl.g:673:4: (lv_peso_3_0= ruleEInt )
            // InternalMyDsl.g:674:5: lv_peso_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getArcoLTAccess().getPesoEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_peso_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArcoLTRule());
            					}
            					set(
            						current,
            						"peso",
            						lv_peso_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getArcoLTAccess().getOrigenKeyword_4());
            		
            // InternalMyDsl.g:695:3: ( ( ruleEString ) )
            // InternalMyDsl.g:696:4: ( ruleEString )
            {
            // InternalMyDsl.g:696:4: ( ruleEString )
            // InternalMyDsl.g:697:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcoLTRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcoLTAccess().getOrigenLugarCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getArcoLTAccess().getDestinoKeyword_6());
            		
            // InternalMyDsl.g:715:3: ( ( ruleEString ) )
            // InternalMyDsl.g:716:4: ( ruleEString )
            {
            // InternalMyDsl.g:716:4: ( ruleEString )
            // InternalMyDsl.g:717:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcoLTRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcoLTAccess().getDestinoTransicionCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getArcoLTAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArcoLT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000009200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}