package geodes.sms.modelquerylanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import geodes.sms.modelquerylanguage.services.ModelQueryLanguageTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelQueryLanguageTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'head'", "'parent'", "'branchName'", "'active'", "'next'", "'from'", "'to'", "'hash'", "'author'", "'message'", "'timestamp'", "'model'", "'modelId'", "'isDeleted'", "'owner'", "'creationDate'", "'path'", "'changed'", "'created'", "'deleted'", "'{'", "'}'", "'['", "']'", "','", "'?'", "'='", "'<'", "'>'", "'!='", "'.'", "'WHO'", "'WHEN'", "'WHAT'", "'WHERE'", "'DESCRIPTION'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalModelQueryLanguageTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelQueryLanguageTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelQueryLanguageTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelQueryLanguageTextual.g"; }



     	private ModelQueryLanguageTextualGrammarAccess grammarAccess;

        public InternalModelQueryLanguageTextualParser(TokenStream input, ModelQueryLanguageTextualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QueryFile";
       	}

       	@Override
       	protected ModelQueryLanguageTextualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQueryFile"
    // InternalModelQueryLanguageTextual.g:65:1: entryRuleQueryFile returns [EObject current=null] : iv_ruleQueryFile= ruleQueryFile EOF ;
    public final EObject entryRuleQueryFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryFile = null;


        try {
            // InternalModelQueryLanguageTextual.g:65:50: (iv_ruleQueryFile= ruleQueryFile EOF )
            // InternalModelQueryLanguageTextual.g:66:2: iv_ruleQueryFile= ruleQueryFile EOF
            {
             newCompositeNode(grammarAccess.getQueryFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryFile=ruleQueryFile();

            state._fsp--;

             current =iv_ruleQueryFile; 
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
    // $ANTLR end "entryRuleQueryFile"


    // $ANTLR start "ruleQueryFile"
    // InternalModelQueryLanguageTextual.g:72:1: ruleQueryFile returns [EObject current=null] : ( () ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )? ) ;
    public final EObject ruleQueryFile() throws RecognitionException {
        EObject current = null;

        EObject lv_queries_1_1 = null;

        EObject lv_queries_1_2 = null;

        EObject lv_queries_1_3 = null;

        EObject lv_queries_1_4 = null;

        EObject lv_queries_3_1 = null;

        EObject lv_queries_3_2 = null;

        EObject lv_queries_3_3 = null;

        EObject lv_queries_3_4 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:78:2: ( ( () ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )? ) )
            // InternalModelQueryLanguageTextual.g:79:2: ( () ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )? )
            {
            // InternalModelQueryLanguageTextual.g:79:2: ( () ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )? )
            // InternalModelQueryLanguageTextual.g:80:3: () ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )?
            {
            // InternalModelQueryLanguageTextual.g:80:3: ()
            // InternalModelQueryLanguageTextual.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryFileAccess().getQueryFileAction_0(),
            					current);
            			

            }

            // InternalModelQueryLanguageTextual.g:87:3: ( ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=42 && LA4_0<=46)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:88:4: ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) ) ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )* ruleQUERY_END
                    {
                    // InternalModelQueryLanguageTextual.g:88:4: ( ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) ) )
                    // InternalModelQueryLanguageTextual.g:89:5: ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) )
                    {
                    // InternalModelQueryLanguageTextual.g:89:5: ( (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents ) )
                    // InternalModelQueryLanguageTextual.g:90:6: (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents )
                    {
                    // InternalModelQueryLanguageTextual.g:90:6: (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents )
                    int alt1=4;
                    alt1 = dfa1.predict(input);
                    switch (alt1) {
                        case 1 :
                            // InternalModelQueryLanguageTextual.g:91:7: lv_queries_1_1= ruleModelQueryHeadParent
                            {

                            							newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryHeadParentParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_queries_1_1=ruleModelQueryHeadParent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQueryFileRule());
                            							}
                            							add(
                            								current,
                            								"queries",
                            								lv_queries_1_1,
                            								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryHeadParent");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalModelQueryLanguageTextual.g:107:7: lv_queries_1_2= ruleModelQueryNextFromTo
                            {

                            							newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryNextFromToParserRuleCall_1_0_0_1());
                            						
                            pushFollow(FOLLOW_3);
                            lv_queries_1_2=ruleModelQueryNextFromTo();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQueryFileRule());
                            							}
                            							add(
                            								current,
                            								"queries",
                            								lv_queries_1_2,
                            								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryNextFromTo");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalModelQueryLanguageTextual.g:123:7: lv_queries_1_3= ruleModelQueryModel
                            {

                            							newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryModelParserRuleCall_1_0_0_2());
                            						
                            pushFollow(FOLLOW_3);
                            lv_queries_1_3=ruleModelQueryModel();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQueryFileRule());
                            							}
                            							add(
                            								current,
                            								"queries",
                            								lv_queries_1_3,
                            								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryModel");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 4 :
                            // InternalModelQueryLanguageTextual.g:139:7: lv_queries_1_4= ruleModelQueryModelContents
                            {

                            							newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryModelContentsParserRuleCall_1_0_0_3());
                            						
                            pushFollow(FOLLOW_3);
                            lv_queries_1_4=ruleModelQueryModelContents();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQueryFileRule());
                            							}
                            							add(
                            								current,
                            								"queries",
                            								lv_queries_1_4,
                            								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryModelContents");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalModelQueryLanguageTextual.g:157:4: ( ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==35) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:158:5: ruleELEM_SEPARATOR ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getQueryFileAccess().getELEM_SEPARATORParserRuleCall_1_1_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:165:5: ( ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) ) )
                    	    // InternalModelQueryLanguageTextual.g:166:6: ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:166:6: ( (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents ) )
                    	    // InternalModelQueryLanguageTextual.g:167:7: (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:167:7: (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents )
                    	    int alt2=4;
                    	    alt2 = dfa2.predict(input);
                    	    switch (alt2) {
                    	        case 1 :
                    	            // InternalModelQueryLanguageTextual.g:168:8: lv_queries_3_1= ruleModelQueryHeadParent
                    	            {

                    	            								newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryHeadParentParserRuleCall_1_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_3);
                    	            lv_queries_3_1=ruleModelQueryHeadParent();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getQueryFileRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"queries",
                    	            									lv_queries_3_1,
                    	            									"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryHeadParent");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalModelQueryLanguageTextual.g:184:8: lv_queries_3_2= ruleModelQueryNextFromTo
                    	            {

                    	            								newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryNextFromToParserRuleCall_1_1_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_3);
                    	            lv_queries_3_2=ruleModelQueryNextFromTo();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getQueryFileRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"queries",
                    	            									lv_queries_3_2,
                    	            									"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryNextFromTo");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalModelQueryLanguageTextual.g:200:8: lv_queries_3_3= ruleModelQueryModel
                    	            {

                    	            								newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryModelParserRuleCall_1_1_1_0_2());
                    	            							
                    	            pushFollow(FOLLOW_3);
                    	            lv_queries_3_3=ruleModelQueryModel();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getQueryFileRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"queries",
                    	            									lv_queries_3_3,
                    	            									"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryModel");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalModelQueryLanguageTextual.g:216:8: lv_queries_3_4= ruleModelQueryModelContents
                    	            {

                    	            								newCompositeNode(grammarAccess.getQueryFileAccess().getQueriesModelQueryModelContentsParserRuleCall_1_1_1_0_3());
                    	            							
                    	            pushFollow(FOLLOW_3);
                    	            lv_queries_3_4=ruleModelQueryModelContents();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getQueryFileRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"queries",
                    	            									lv_queries_3_4,
                    	            									"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelQueryModelContents");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getQueryFileAccess().getQUERY_ENDParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleQUERY_END();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQueryFile"


    // $ANTLR start "entryRuleModelQueryHeadParent"
    // InternalModelQueryLanguageTextual.g:247:1: entryRuleModelQueryHeadParent returns [EObject current=null] : iv_ruleModelQueryHeadParent= ruleModelQueryHeadParent EOF ;
    public final EObject entryRuleModelQueryHeadParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelQueryHeadParent = null;


        try {
            // InternalModelQueryLanguageTextual.g:247:61: (iv_ruleModelQueryHeadParent= ruleModelQueryHeadParent EOF )
            // InternalModelQueryLanguageTextual.g:248:2: iv_ruleModelQueryHeadParent= ruleModelQueryHeadParent EOF
            {
             newCompositeNode(grammarAccess.getModelQueryHeadParentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelQueryHeadParent=ruleModelQueryHeadParent();

            state._fsp--;

             current =iv_ruleModelQueryHeadParent; 
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
    // $ANTLR end "entryRuleModelQueryHeadParent"


    // $ANTLR start "ruleModelQueryHeadParent"
    // InternalModelQueryLanguageTextual.g:254:1: ruleModelQueryHeadParent returns [EObject current=null] : ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) ;
    public final EObject ruleModelQueryHeadParent() throws RecognitionException {
        EObject current = null;

        Token lv_subject_1_1=null;
        Token lv_subject_1_2=null;
        Enumerator lv_operator_0_1 = null;

        Enumerator lv_operator_0_2 = null;

        AntlrDatatypeRuleToken lv_containerParameters_3_0 = null;

        AntlrDatatypeRuleToken lv_containerParameters_5_0 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:260:2: ( ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) )
            // InternalModelQueryLanguageTextual.g:261:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            {
            // InternalModelQueryLanguageTextual.g:261:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            // InternalModelQueryLanguageTextual.g:262:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            {
            // InternalModelQueryLanguageTextual.g:262:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) )
            // InternalModelQueryLanguageTextual.g:263:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            {
            // InternalModelQueryLanguageTextual.g:263:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            // InternalModelQueryLanguageTextual.g:264:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            {
            // InternalModelQueryLanguageTextual.g:264:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=42 && LA5_0<=45)) ) {
                alt5=1;
            }
            else if ( (LA5_0==46) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:265:6: lv_operator_0_1= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getOperatorOperatorEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_operator_0_1=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryHeadParentRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_1,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:281:6: lv_operator_0_2= ruleWhereSyn
                    {

                    						newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getOperatorWhereSynEnumRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_operator_0_2=ruleWhereSyn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryHeadParentRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_2,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.WhereSyn");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:299:3: ( ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) ) )
            // InternalModelQueryLanguageTextual.g:300:4: ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) )
            {
            // InternalModelQueryLanguageTextual.g:300:4: ( (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' ) )
            // InternalModelQueryLanguageTextual.g:301:5: (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' )
            {
            // InternalModelQueryLanguageTextual.g:301:5: (lv_subject_1_1= 'head' | lv_subject_1_2= 'parent' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:302:6: lv_subject_1_1= 'head'
                    {
                    lv_subject_1_1=(Token)match(input,11,FOLLOW_6); 

                    						newLeafNode(lv_subject_1_1, grammarAccess.getModelQueryHeadParentAccess().getSubjectHeadKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryHeadParentRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:313:6: lv_subject_1_2= 'parent'
                    {
                    lv_subject_1_2=(Token)match(input,12,FOLLOW_6); 

                    						newLeafNode(lv_subject_1_2, grammarAccess.getModelQueryHeadParentAccess().getSubjectParentKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryHeadParentRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:326:3: ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:327:4: ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleBranchParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )* ruleCONTAINER_DELIM_RIGHT
                    {

                    				newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getCONTAINER_DELIM_LEFTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_7);
                    ruleCONTAINER_DELIM_LEFT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelQueryLanguageTextual.g:334:4: ( (lv_containerParameters_3_0= ruleBranchParameter ) )
                    // InternalModelQueryLanguageTextual.g:335:5: (lv_containerParameters_3_0= ruleBranchParameter )
                    {
                    // InternalModelQueryLanguageTextual.g:335:5: (lv_containerParameters_3_0= ruleBranchParameter )
                    // InternalModelQueryLanguageTextual.g:336:6: lv_containerParameters_3_0= ruleBranchParameter
                    {

                    						newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getContainerParametersBranchParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_containerParameters_3_0=ruleBranchParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryHeadParentRule());
                    						}
                    						add(
                    							current,
                    							"containerParameters",
                    							lv_containerParameters_3_0,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.BranchParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelQueryLanguageTextual.g:353:4: ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==35) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:354:5: ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleBranchParameter ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getELEM_SEPARATORParserRuleCall_2_2_0());
                    	    				
                    	    pushFollow(FOLLOW_7);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:361:5: ( (lv_containerParameters_5_0= ruleBranchParameter ) )
                    	    // InternalModelQueryLanguageTextual.g:362:6: (lv_containerParameters_5_0= ruleBranchParameter )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:362:6: (lv_containerParameters_5_0= ruleBranchParameter )
                    	    // InternalModelQueryLanguageTextual.g:363:7: lv_containerParameters_5_0= ruleBranchParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getContainerParametersBranchParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_containerParameters_5_0=ruleBranchParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelQueryHeadParentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containerParameters",
                    	    								lv_containerParameters_5_0,
                    	    								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.BranchParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getModelQueryHeadParentAccess().getCONTAINER_DELIM_RIGHTParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCONTAINER_DELIM_RIGHT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelQueryHeadParent"


    // $ANTLR start "entryRuleBranchParameter"
    // InternalModelQueryLanguageTextual.g:393:1: entryRuleBranchParameter returns [String current=null] : iv_ruleBranchParameter= ruleBranchParameter EOF ;
    public final String entryRuleBranchParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBranchParameter = null;


        try {
            // InternalModelQueryLanguageTextual.g:393:55: (iv_ruleBranchParameter= ruleBranchParameter EOF )
            // InternalModelQueryLanguageTextual.g:394:2: iv_ruleBranchParameter= ruleBranchParameter EOF
            {
             newCompositeNode(grammarAccess.getBranchParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchParameter=ruleBranchParameter();

            state._fsp--;

             current =iv_ruleBranchParameter.getText(); 
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
    // $ANTLR end "entryRuleBranchParameter"


    // $ANTLR start "ruleBranchParameter"
    // InternalModelQueryLanguageTextual.g:400:1: ruleBranchParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'branchName' | kw= 'active' ) (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE ) this_EString_6= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleBranchParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PARAM_EQ_2 = null;

        AntlrDatatypeRuleToken this_PARAM_GT_3 = null;

        AntlrDatatypeRuleToken this_PARAM_LT_4 = null;

        AntlrDatatypeRuleToken this_PARAM_NE_5 = null;

        AntlrDatatypeRuleToken this_EString_6 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:406:2: ( ( (kw= 'branchName' | kw= 'active' ) (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE ) this_EString_6= ruleEString ) )
            // InternalModelQueryLanguageTextual.g:407:2: ( (kw= 'branchName' | kw= 'active' ) (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE ) this_EString_6= ruleEString )
            {
            // InternalModelQueryLanguageTextual.g:407:2: ( (kw= 'branchName' | kw= 'active' ) (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE ) this_EString_6= ruleEString )
            // InternalModelQueryLanguageTextual.g:408:3: (kw= 'branchName' | kw= 'active' ) (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE ) this_EString_6= ruleEString
            {
            // InternalModelQueryLanguageTextual.g:408:3: (kw= 'branchName' | kw= 'active' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:409:4: kw= 'branchName'
                    {
                    kw=(Token)match(input,13,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBranchParameterAccess().getBranchNameKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:415:4: kw= 'active'
                    {
                    kw=(Token)match(input,14,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBranchParameterAccess().getActiveKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelQueryLanguageTextual.g:421:3: (this_PARAM_EQ_2= rulePARAM_EQ | this_PARAM_GT_3= rulePARAM_GT | this_PARAM_LT_4= rulePARAM_LT | this_PARAM_NE_5= rulePARAM_NE )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:422:4: this_PARAM_EQ_2= rulePARAM_EQ
                    {

                    				newCompositeNode(grammarAccess.getBranchParameterAccess().getPARAM_EQParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_EQ_2=rulePARAM_EQ();

                    state._fsp--;


                    				current.merge(this_PARAM_EQ_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:433:4: this_PARAM_GT_3= rulePARAM_GT
                    {

                    				newCompositeNode(grammarAccess.getBranchParameterAccess().getPARAM_GTParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_GT_3=rulePARAM_GT();

                    state._fsp--;


                    				current.merge(this_PARAM_GT_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:444:4: this_PARAM_LT_4= rulePARAM_LT
                    {

                    				newCompositeNode(grammarAccess.getBranchParameterAccess().getPARAM_LTParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_LT_4=rulePARAM_LT();

                    state._fsp--;


                    				current.merge(this_PARAM_LT_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:455:4: this_PARAM_NE_5= rulePARAM_NE
                    {

                    				newCompositeNode(grammarAccess.getBranchParameterAccess().getPARAM_NEParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_NE_5=rulePARAM_NE();

                    state._fsp--;


                    				current.merge(this_PARAM_NE_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getBranchParameterAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_EString_6=ruleEString();

            state._fsp--;


            			current.merge(this_EString_6);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleBranchParameter"


    // $ANTLR start "entryRuleModelQueryNextFromTo"
    // InternalModelQueryLanguageTextual.g:480:1: entryRuleModelQueryNextFromTo returns [EObject current=null] : iv_ruleModelQueryNextFromTo= ruleModelQueryNextFromTo EOF ;
    public final EObject entryRuleModelQueryNextFromTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelQueryNextFromTo = null;


        try {
            // InternalModelQueryLanguageTextual.g:480:61: (iv_ruleModelQueryNextFromTo= ruleModelQueryNextFromTo EOF )
            // InternalModelQueryLanguageTextual.g:481:2: iv_ruleModelQueryNextFromTo= ruleModelQueryNextFromTo EOF
            {
             newCompositeNode(grammarAccess.getModelQueryNextFromToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelQueryNextFromTo=ruleModelQueryNextFromTo();

            state._fsp--;

             current =iv_ruleModelQueryNextFromTo; 
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
    // $ANTLR end "entryRuleModelQueryNextFromTo"


    // $ANTLR start "ruleModelQueryNextFromTo"
    // InternalModelQueryLanguageTextual.g:487:1: ruleModelQueryNextFromTo returns [EObject current=null] : ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) ;
    public final EObject ruleModelQueryNextFromTo() throws RecognitionException {
        EObject current = null;

        Token lv_subject_1_1=null;
        Token lv_subject_1_2=null;
        Token lv_subject_1_3=null;
        Enumerator lv_operator_0_1 = null;

        Enumerator lv_operator_0_2 = null;

        AntlrDatatypeRuleToken lv_containerParameters_3_0 = null;

        AntlrDatatypeRuleToken lv_containerParameters_5_0 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:493:2: ( ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) )
            // InternalModelQueryLanguageTextual.g:494:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            {
            // InternalModelQueryLanguageTextual.g:494:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            // InternalModelQueryLanguageTextual.g:495:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            {
            // InternalModelQueryLanguageTextual.g:495:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) )
            // InternalModelQueryLanguageTextual.g:496:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            {
            // InternalModelQueryLanguageTextual.g:496:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            // InternalModelQueryLanguageTextual.g:497:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            {
            // InternalModelQueryLanguageTextual.g:497:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=42 && LA11_0<=45)) ) {
                alt11=1;
            }
            else if ( (LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:498:6: lv_operator_0_1= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getOperatorOperatorEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operator_0_1=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_1,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:514:6: lv_operator_0_2= ruleWhereSyn
                    {

                    						newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getOperatorWhereSynEnumRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operator_0_2=ruleWhereSyn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_2,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.WhereSyn");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:532:3: ( ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) ) )
            // InternalModelQueryLanguageTextual.g:533:4: ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) )
            {
            // InternalModelQueryLanguageTextual.g:533:4: ( (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' ) )
            // InternalModelQueryLanguageTextual.g:534:5: (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' )
            {
            // InternalModelQueryLanguageTextual.g:534:5: (lv_subject_1_1= 'next' | lv_subject_1_2= 'from' | lv_subject_1_3= 'to' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:535:6: lv_subject_1_1= 'next'
                    {
                    lv_subject_1_1=(Token)match(input,15,FOLLOW_6); 

                    						newLeafNode(lv_subject_1_1, grammarAccess.getModelQueryNextFromToAccess().getSubjectNextKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:546:6: lv_subject_1_2= 'from'
                    {
                    lv_subject_1_2=(Token)match(input,16,FOLLOW_6); 

                    						newLeafNode(lv_subject_1_2, grammarAccess.getModelQueryNextFromToAccess().getSubjectFromKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:557:6: lv_subject_1_3= 'to'
                    {
                    lv_subject_1_3=(Token)match(input,17,FOLLOW_6); 

                    						newLeafNode(lv_subject_1_3, grammarAccess.getModelQueryNextFromToAccess().getSubjectToKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:570:3: ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:571:4: ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT
                    {

                    				newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getCONTAINER_DELIM_LEFTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_12);
                    ruleCONTAINER_DELIM_LEFT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelQueryLanguageTextual.g:578:4: ( (lv_containerParameters_3_0= ruleCommitParameter ) )
                    // InternalModelQueryLanguageTextual.g:579:5: (lv_containerParameters_3_0= ruleCommitParameter )
                    {
                    // InternalModelQueryLanguageTextual.g:579:5: (lv_containerParameters_3_0= ruleCommitParameter )
                    // InternalModelQueryLanguageTextual.g:580:6: lv_containerParameters_3_0= ruleCommitParameter
                    {

                    						newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getContainerParametersCommitParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_containerParameters_3_0=ruleCommitParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryNextFromToRule());
                    						}
                    						add(
                    							current,
                    							"containerParameters",
                    							lv_containerParameters_3_0,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.CommitParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelQueryLanguageTextual.g:597:4: ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==35) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:598:5: ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getELEM_SEPARATORParserRuleCall_2_2_0());
                    	    				
                    	    pushFollow(FOLLOW_12);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:605:5: ( (lv_containerParameters_5_0= ruleCommitParameter ) )
                    	    // InternalModelQueryLanguageTextual.g:606:6: (lv_containerParameters_5_0= ruleCommitParameter )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:606:6: (lv_containerParameters_5_0= ruleCommitParameter )
                    	    // InternalModelQueryLanguageTextual.g:607:7: lv_containerParameters_5_0= ruleCommitParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getContainerParametersCommitParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_containerParameters_5_0=ruleCommitParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelQueryNextFromToRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containerParameters",
                    	    								lv_containerParameters_5_0,
                    	    								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.CommitParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getModelQueryNextFromToAccess().getCONTAINER_DELIM_RIGHTParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCONTAINER_DELIM_RIGHT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelQueryNextFromTo"


    // $ANTLR start "entryRuleCommitParameter"
    // InternalModelQueryLanguageTextual.g:637:1: entryRuleCommitParameter returns [String current=null] : iv_ruleCommitParameter= ruleCommitParameter EOF ;
    public final String entryRuleCommitParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommitParameter = null;


        try {
            // InternalModelQueryLanguageTextual.g:637:55: (iv_ruleCommitParameter= ruleCommitParameter EOF )
            // InternalModelQueryLanguageTextual.g:638:2: iv_ruleCommitParameter= ruleCommitParameter EOF
            {
             newCompositeNode(grammarAccess.getCommitParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommitParameter=ruleCommitParameter();

            state._fsp--;

             current =iv_ruleCommitParameter.getText(); 
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
    // $ANTLR end "entryRuleCommitParameter"


    // $ANTLR start "ruleCommitParameter"
    // InternalModelQueryLanguageTextual.g:644:1: ruleCommitParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' ) (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE ) this_EString_8= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleCommitParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PARAM_EQ_4 = null;

        AntlrDatatypeRuleToken this_PARAM_GT_5 = null;

        AntlrDatatypeRuleToken this_PARAM_LT_6 = null;

        AntlrDatatypeRuleToken this_PARAM_NE_7 = null;

        AntlrDatatypeRuleToken this_EString_8 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:650:2: ( ( (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' ) (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE ) this_EString_8= ruleEString ) )
            // InternalModelQueryLanguageTextual.g:651:2: ( (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' ) (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE ) this_EString_8= ruleEString )
            {
            // InternalModelQueryLanguageTextual.g:651:2: ( (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' ) (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE ) this_EString_8= ruleEString )
            // InternalModelQueryLanguageTextual.g:652:3: (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' ) (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE ) this_EString_8= ruleEString
            {
            // InternalModelQueryLanguageTextual.g:652:3: (kw= 'hash' | kw= 'author' | kw= 'message' | kw= 'timestamp' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            case 21:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:653:4: kw= 'hash'
                    {
                    kw=(Token)match(input,18,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommitParameterAccess().getHashKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:659:4: kw= 'author'
                    {
                    kw=(Token)match(input,19,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommitParameterAccess().getAuthorKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:665:4: kw= 'message'
                    {
                    kw=(Token)match(input,20,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommitParameterAccess().getMessageKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:671:4: kw= 'timestamp'
                    {
                    kw=(Token)match(input,21,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommitParameterAccess().getTimestampKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalModelQueryLanguageTextual.g:677:3: (this_PARAM_EQ_4= rulePARAM_EQ | this_PARAM_GT_5= rulePARAM_GT | this_PARAM_LT_6= rulePARAM_LT | this_PARAM_NE_7= rulePARAM_NE )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 40:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:678:4: this_PARAM_EQ_4= rulePARAM_EQ
                    {

                    				newCompositeNode(grammarAccess.getCommitParameterAccess().getPARAM_EQParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_EQ_4=rulePARAM_EQ();

                    state._fsp--;


                    				current.merge(this_PARAM_EQ_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:689:4: this_PARAM_GT_5= rulePARAM_GT
                    {

                    				newCompositeNode(grammarAccess.getCommitParameterAccess().getPARAM_GTParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_GT_5=rulePARAM_GT();

                    state._fsp--;


                    				current.merge(this_PARAM_GT_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:700:4: this_PARAM_LT_6= rulePARAM_LT
                    {

                    				newCompositeNode(grammarAccess.getCommitParameterAccess().getPARAM_LTParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_LT_6=rulePARAM_LT();

                    state._fsp--;


                    				current.merge(this_PARAM_LT_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:711:4: this_PARAM_NE_7= rulePARAM_NE
                    {

                    				newCompositeNode(grammarAccess.getCommitParameterAccess().getPARAM_NEParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_NE_7=rulePARAM_NE();

                    state._fsp--;


                    				current.merge(this_PARAM_NE_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getCommitParameterAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_EString_8=ruleEString();

            state._fsp--;


            			current.merge(this_EString_8);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleCommitParameter"


    // $ANTLR start "entryRuleModelQueryModel"
    // InternalModelQueryLanguageTextual.g:736:1: entryRuleModelQueryModel returns [EObject current=null] : iv_ruleModelQueryModel= ruleModelQueryModel EOF ;
    public final EObject entryRuleModelQueryModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelQueryModel = null;


        try {
            // InternalModelQueryLanguageTextual.g:736:56: (iv_ruleModelQueryModel= ruleModelQueryModel EOF )
            // InternalModelQueryLanguageTextual.g:737:2: iv_ruleModelQueryModel= ruleModelQueryModel EOF
            {
             newCompositeNode(grammarAccess.getModelQueryModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelQueryModel=ruleModelQueryModel();

            state._fsp--;

             current =iv_ruleModelQueryModel; 
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
    // $ANTLR end "entryRuleModelQueryModel"


    // $ANTLR start "ruleModelQueryModel"
    // InternalModelQueryLanguageTextual.g:743:1: ruleModelQueryModel returns [EObject current=null] : ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( (lv_subject_1_0= 'model' ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) ;
    public final EObject ruleModelQueryModel() throws RecognitionException {
        EObject current = null;

        Token lv_subject_1_0=null;
        Enumerator lv_operator_0_1 = null;

        Enumerator lv_operator_0_2 = null;

        AntlrDatatypeRuleToken lv_containerParameters_3_0 = null;

        AntlrDatatypeRuleToken lv_containerParameters_5_0 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:749:2: ( ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( (lv_subject_1_0= 'model' ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )? ) )
            // InternalModelQueryLanguageTextual.g:750:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( (lv_subject_1_0= 'model' ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            {
            // InternalModelQueryLanguageTextual.g:750:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( (lv_subject_1_0= 'model' ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )? )
            // InternalModelQueryLanguageTextual.g:751:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( (lv_subject_1_0= 'model' ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            {
            // InternalModelQueryLanguageTextual.g:751:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) )
            // InternalModelQueryLanguageTextual.g:752:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            {
            // InternalModelQueryLanguageTextual.g:752:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            // InternalModelQueryLanguageTextual.g:753:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            {
            // InternalModelQueryLanguageTextual.g:753:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=42 && LA17_0<=45)) ) {
                alt17=1;
            }
            else if ( (LA17_0==46) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:754:6: lv_operator_0_1= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelAccess().getOperatorOperatorEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_operator_0_1=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_1,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:770:6: lv_operator_0_2= ruleWhereSyn
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelAccess().getOperatorWhereSynEnumRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_13);
                    lv_operator_0_2=ruleWhereSyn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_2,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.WhereSyn");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:788:3: ( (lv_subject_1_0= 'model' ) )
            // InternalModelQueryLanguageTextual.g:789:4: (lv_subject_1_0= 'model' )
            {
            // InternalModelQueryLanguageTextual.g:789:4: (lv_subject_1_0= 'model' )
            // InternalModelQueryLanguageTextual.g:790:5: lv_subject_1_0= 'model'
            {
            lv_subject_1_0=(Token)match(input,22,FOLLOW_6); 

            					newLeafNode(lv_subject_1_0, grammarAccess.getModelQueryModelAccess().getSubjectModelKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelQueryModelRule());
            					}
            					setWithLastConsumed(current, "subject", lv_subject_1_0, "model");
            				

            }


            }

            // InternalModelQueryLanguageTextual.g:802:3: ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:803:4: ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleModelParamater ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )* ruleCONTAINER_DELIM_RIGHT
                    {

                    				newCompositeNode(grammarAccess.getModelQueryModelAccess().getCONTAINER_DELIM_LEFTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_14);
                    ruleCONTAINER_DELIM_LEFT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelQueryLanguageTextual.g:810:4: ( (lv_containerParameters_3_0= ruleModelParamater ) )
                    // InternalModelQueryLanguageTextual.g:811:5: (lv_containerParameters_3_0= ruleModelParamater )
                    {
                    // InternalModelQueryLanguageTextual.g:811:5: (lv_containerParameters_3_0= ruleModelParamater )
                    // InternalModelQueryLanguageTextual.g:812:6: lv_containerParameters_3_0= ruleModelParamater
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelAccess().getContainerParametersModelParamaterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_containerParameters_3_0=ruleModelParamater();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelRule());
                    						}
                    						add(
                    							current,
                    							"containerParameters",
                    							lv_containerParameters_3_0,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelParamater");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelQueryLanguageTextual.g:829:4: ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==35) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:830:5: ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleModelParamater ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelQueryModelAccess().getELEM_SEPARATORParserRuleCall_2_2_0());
                    	    				
                    	    pushFollow(FOLLOW_14);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:837:5: ( (lv_containerParameters_5_0= ruleModelParamater ) )
                    	    // InternalModelQueryLanguageTextual.g:838:6: (lv_containerParameters_5_0= ruleModelParamater )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:838:6: (lv_containerParameters_5_0= ruleModelParamater )
                    	    // InternalModelQueryLanguageTextual.g:839:7: lv_containerParameters_5_0= ruleModelParamater
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelQueryModelAccess().getContainerParametersModelParamaterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_containerParameters_5_0=ruleModelParamater();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelQueryModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containerParameters",
                    	    								lv_containerParameters_5_0,
                    	    								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.ModelParamater");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getModelQueryModelAccess().getCONTAINER_DELIM_RIGHTParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCONTAINER_DELIM_RIGHT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelQueryModel"


    // $ANTLR start "entryRuleModelParamater"
    // InternalModelQueryLanguageTextual.g:869:1: entryRuleModelParamater returns [String current=null] : iv_ruleModelParamater= ruleModelParamater EOF ;
    public final String entryRuleModelParamater() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModelParamater = null;


        try {
            // InternalModelQueryLanguageTextual.g:869:54: (iv_ruleModelParamater= ruleModelParamater EOF )
            // InternalModelQueryLanguageTextual.g:870:2: iv_ruleModelParamater= ruleModelParamater EOF
            {
             newCompositeNode(grammarAccess.getModelParamaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelParamater=ruleModelParamater();

            state._fsp--;

             current =iv_ruleModelParamater.getText(); 
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
    // $ANTLR end "entryRuleModelParamater"


    // $ANTLR start "ruleModelParamater"
    // InternalModelQueryLanguageTextual.g:876:1: ruleModelParamater returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' ) (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE ) this_EString_9= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleModelParamater() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PARAM_EQ_5 = null;

        AntlrDatatypeRuleToken this_PARAM_GT_6 = null;

        AntlrDatatypeRuleToken this_PARAM_LT_7 = null;

        AntlrDatatypeRuleToken this_PARAM_NE_8 = null;

        AntlrDatatypeRuleToken this_EString_9 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:882:2: ( ( (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' ) (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE ) this_EString_9= ruleEString ) )
            // InternalModelQueryLanguageTextual.g:883:2: ( (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' ) (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE ) this_EString_9= ruleEString )
            {
            // InternalModelQueryLanguageTextual.g:883:2: ( (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' ) (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE ) this_EString_9= ruleEString )
            // InternalModelQueryLanguageTextual.g:884:3: (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' ) (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE ) this_EString_9= ruleEString
            {
            // InternalModelQueryLanguageTextual.g:884:3: (kw= 'modelId' | kw= 'isDeleted' | kw= 'owner' | kw= 'creationDate' | kw= 'path' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt20=1;
                }
                break;
            case 24:
                {
                alt20=2;
                }
                break;
            case 25:
                {
                alt20=3;
                }
                break;
            case 26:
                {
                alt20=4;
                }
                break;
            case 27:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:885:4: kw= 'modelId'
                    {
                    kw=(Token)match(input,23,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelParamaterAccess().getModelIdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:891:4: kw= 'isDeleted'
                    {
                    kw=(Token)match(input,24,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelParamaterAccess().getIsDeletedKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:897:4: kw= 'owner'
                    {
                    kw=(Token)match(input,25,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelParamaterAccess().getOwnerKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:903:4: kw= 'creationDate'
                    {
                    kw=(Token)match(input,26,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelParamaterAccess().getCreationDateKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelQueryLanguageTextual.g:909:4: kw= 'path'
                    {
                    kw=(Token)match(input,27,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelParamaterAccess().getPathKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalModelQueryLanguageTextual.g:915:3: (this_PARAM_EQ_5= rulePARAM_EQ | this_PARAM_GT_6= rulePARAM_GT | this_PARAM_LT_7= rulePARAM_LT | this_PARAM_NE_8= rulePARAM_NE )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 40:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:916:4: this_PARAM_EQ_5= rulePARAM_EQ
                    {

                    				newCompositeNode(grammarAccess.getModelParamaterAccess().getPARAM_EQParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_EQ_5=rulePARAM_EQ();

                    state._fsp--;


                    				current.merge(this_PARAM_EQ_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:927:4: this_PARAM_GT_6= rulePARAM_GT
                    {

                    				newCompositeNode(grammarAccess.getModelParamaterAccess().getPARAM_GTParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_GT_6=rulePARAM_GT();

                    state._fsp--;


                    				current.merge(this_PARAM_GT_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:938:4: this_PARAM_LT_7= rulePARAM_LT
                    {

                    				newCompositeNode(grammarAccess.getModelParamaterAccess().getPARAM_LTParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_LT_7=rulePARAM_LT();

                    state._fsp--;


                    				current.merge(this_PARAM_LT_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:949:4: this_PARAM_NE_8= rulePARAM_NE
                    {

                    				newCompositeNode(grammarAccess.getModelParamaterAccess().getPARAM_NEParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAM_NE_8=rulePARAM_NE();

                    state._fsp--;


                    				current.merge(this_PARAM_NE_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getModelParamaterAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_EString_9=ruleEString();

            state._fsp--;


            			current.merge(this_EString_9);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleModelParamater"


    // $ANTLR start "entryRuleModelQueryModelContents"
    // InternalModelQueryLanguageTextual.g:974:1: entryRuleModelQueryModelContents returns [EObject current=null] : iv_ruleModelQueryModelContents= ruleModelQueryModelContents EOF ;
    public final EObject entryRuleModelQueryModelContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelQueryModelContents = null;


        try {
            // InternalModelQueryLanguageTextual.g:974:64: (iv_ruleModelQueryModelContents= ruleModelQueryModelContents EOF )
            // InternalModelQueryLanguageTextual.g:975:2: iv_ruleModelQueryModelContents= ruleModelQueryModelContents EOF
            {
             newCompositeNode(grammarAccess.getModelQueryModelContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelQueryModelContents=ruleModelQueryModelContents();

            state._fsp--;

             current =iv_ruleModelQueryModelContents; 
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
    // $ANTLR end "entryRuleModelQueryModelContents"


    // $ANTLR start "ruleModelQueryModelContents"
    // InternalModelQueryLanguageTextual.g:981:1: ruleModelQueryModelContents returns [EObject current=null] : ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )? ) ;
    public final EObject ruleModelQueryModelContents() throws RecognitionException {
        EObject current = null;

        Token lv_subject_1_1=null;
        Token lv_subject_1_2=null;
        Token lv_subject_1_3=null;
        Enumerator lv_operator_0_1 = null;

        Enumerator lv_operator_0_2 = null;

        AntlrDatatypeRuleToken lv_containerParameters_3_0 = null;

        AntlrDatatypeRuleToken lv_containerParameters_5_0 = null;

        AntlrDatatypeRuleToken lv_diffParameters_8_0 = null;

        AntlrDatatypeRuleToken lv_diffParameters_10_0 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:987:2: ( ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )? ) )
            // InternalModelQueryLanguageTextual.g:988:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )? )
            {
            // InternalModelQueryLanguageTextual.g:988:2: ( ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )? )
            // InternalModelQueryLanguageTextual.g:989:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) ) ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) ) ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )? ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )?
            {
            // InternalModelQueryLanguageTextual.g:989:3: ( ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) ) )
            // InternalModelQueryLanguageTextual.g:990:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            {
            // InternalModelQueryLanguageTextual.g:990:4: ( (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn ) )
            // InternalModelQueryLanguageTextual.g:991:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            {
            // InternalModelQueryLanguageTextual.g:991:5: (lv_operator_0_1= ruleOperator | lv_operator_0_2= ruleWhereSyn )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=42 && LA22_0<=45)) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:992:6: lv_operator_0_1= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getOperatorOperatorEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_operator_0_1=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_1,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:1008:6: lv_operator_0_2= ruleWhereSyn
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getOperatorWhereSynEnumRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_operator_0_2=ruleWhereSyn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_0_2,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.WhereSyn");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:1026:3: ( ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) ) )
            // InternalModelQueryLanguageTextual.g:1027:4: ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) )
            {
            // InternalModelQueryLanguageTextual.g:1027:4: ( (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' ) )
            // InternalModelQueryLanguageTextual.g:1028:5: (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' )
            {
            // InternalModelQueryLanguageTextual.g:1028:5: (lv_subject_1_1= 'changed' | lv_subject_1_2= 'created' | lv_subject_1_3= 'deleted' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt23=1;
                }
                break;
            case 29:
                {
                alt23=2;
                }
                break;
            case 30:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:1029:6: lv_subject_1_1= 'changed'
                    {
                    lv_subject_1_1=(Token)match(input,28,FOLLOW_16); 

                    						newLeafNode(lv_subject_1_1, grammarAccess.getModelQueryModelContentsAccess().getSubjectChangedKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:1040:6: lv_subject_1_2= 'created'
                    {
                    lv_subject_1_2=(Token)match(input,29,FOLLOW_16); 

                    						newLeafNode(lv_subject_1_2, grammarAccess.getModelQueryModelContentsAccess().getSubjectCreatedKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:1051:6: lv_subject_1_3= 'deleted'
                    {
                    lv_subject_1_3=(Token)match(input,30,FOLLOW_16); 

                    						newLeafNode(lv_subject_1_3, grammarAccess.getModelQueryModelContentsAccess().getSubjectDeletedKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						setWithLastConsumed(current, "subject", lv_subject_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalModelQueryLanguageTextual.g:1064:3: ( ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:1065:4: ruleCONTAINER_DELIM_LEFT ( (lv_containerParameters_3_0= ruleCommitParameter ) ) ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )* ruleCONTAINER_DELIM_RIGHT
                    {

                    				newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getCONTAINER_DELIM_LEFTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_12);
                    ruleCONTAINER_DELIM_LEFT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelQueryLanguageTextual.g:1072:4: ( (lv_containerParameters_3_0= ruleCommitParameter ) )
                    // InternalModelQueryLanguageTextual.g:1073:5: (lv_containerParameters_3_0= ruleCommitParameter )
                    {
                    // InternalModelQueryLanguageTextual.g:1073:5: (lv_containerParameters_3_0= ruleCommitParameter )
                    // InternalModelQueryLanguageTextual.g:1074:6: lv_containerParameters_3_0= ruleCommitParameter
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getContainerParametersCommitParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_containerParameters_3_0=ruleCommitParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						add(
                    							current,
                    							"containerParameters",
                    							lv_containerParameters_3_0,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.CommitParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelQueryLanguageTextual.g:1091:4: ( ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:1092:5: ruleELEM_SEPARATOR ( (lv_containerParameters_5_0= ruleCommitParameter ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getELEM_SEPARATORParserRuleCall_2_2_0());
                    	    				
                    	    pushFollow(FOLLOW_12);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:1099:5: ( (lv_containerParameters_5_0= ruleCommitParameter ) )
                    	    // InternalModelQueryLanguageTextual.g:1100:6: (lv_containerParameters_5_0= ruleCommitParameter )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:1100:6: (lv_containerParameters_5_0= ruleCommitParameter )
                    	    // InternalModelQueryLanguageTextual.g:1101:7: lv_containerParameters_5_0= ruleCommitParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getContainerParametersCommitParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_containerParameters_5_0=ruleCommitParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containerParameters",
                    	    								lv_containerParameters_5_0,
                    	    								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.CommitParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getCONTAINER_DELIM_RIGHTParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_17);
                    ruleCONTAINER_DELIM_RIGHT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelQueryLanguageTextual.g:1127:3: ( ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:1128:4: ruleSUBJECT_DELIM_LEFT ( (lv_diffParameters_8_0= ruleProperties ) ) ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )* ruleSUBJECT_DELIM_RIGHT
                    {

                    				newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getSUBJECT_DELIM_LEFTParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_10);
                    ruleSUBJECT_DELIM_LEFT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelQueryLanguageTextual.g:1135:4: ( (lv_diffParameters_8_0= ruleProperties ) )
                    // InternalModelQueryLanguageTextual.g:1136:5: (lv_diffParameters_8_0= ruleProperties )
                    {
                    // InternalModelQueryLanguageTextual.g:1136:5: (lv_diffParameters_8_0= ruleProperties )
                    // InternalModelQueryLanguageTextual.g:1137:6: lv_diffParameters_8_0= ruleProperties
                    {

                    						newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getDiffParametersPropertiesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_diffParameters_8_0=ruleProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    						}
                    						add(
                    							current,
                    							"diffParameters",
                    							lv_diffParameters_8_0,
                    							"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Properties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelQueryLanguageTextual.g:1154:4: ( ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalModelQueryLanguageTextual.g:1155:5: ruleELEM_SEPARATOR ( (lv_diffParameters_10_0= ruleProperties ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getELEM_SEPARATORParserRuleCall_3_2_0());
                    	    				
                    	    pushFollow(FOLLOW_10);
                    	    ruleELEM_SEPARATOR();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalModelQueryLanguageTextual.g:1162:5: ( (lv_diffParameters_10_0= ruleProperties ) )
                    	    // InternalModelQueryLanguageTextual.g:1163:6: (lv_diffParameters_10_0= ruleProperties )
                    	    {
                    	    // InternalModelQueryLanguageTextual.g:1163:6: (lv_diffParameters_10_0= ruleProperties )
                    	    // InternalModelQueryLanguageTextual.g:1164:7: lv_diffParameters_10_0= ruleProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getDiffParametersPropertiesParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_diffParameters_10_0=ruleProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelQueryModelContentsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"diffParameters",
                    	    								lv_diffParameters_10_0,
                    	    								"geodes.sms.modelquerylanguage.ModelQueryLanguageTextual.Properties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    				newCompositeNode(grammarAccess.getModelQueryModelContentsAccess().getSUBJECT_DELIM_RIGHTParserRuleCall_3_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleSUBJECT_DELIM_RIGHT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelQueryModelContents"


    // $ANTLR start "entryRuleProperties"
    // InternalModelQueryLanguageTextual.g:1194:1: entryRuleProperties returns [String current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final String entryRuleProperties() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperties = null;


        try {
            // InternalModelQueryLanguageTextual.g:1194:50: (iv_ruleProperties= ruleProperties EOF )
            // InternalModelQueryLanguageTextual.g:1195:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties.getText(); 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalModelQueryLanguageTextual.g:1201:1: ruleProperties returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleProperties() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_PARAM_SUBPROP_1 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;



        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1207:2: ( (this_EString_0= ruleEString (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )* ) )
            // InternalModelQueryLanguageTextual.g:1208:2: (this_EString_0= ruleEString (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )* )
            {
            // InternalModelQueryLanguageTextual.g:1208:2: (this_EString_0= ruleEString (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )* )
            // InternalModelQueryLanguageTextual.g:1209:3: this_EString_0= ruleEString (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )*
            {

            			newCompositeNode(grammarAccess.getPropertiesAccess().getEStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EString_0=ruleEString();

            state._fsp--;


            			current.merge(this_EString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalModelQueryLanguageTextual.g:1219:3: (this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalModelQueryLanguageTextual.g:1220:4: this_PARAM_SUBPROP_1= rulePARAM_SUBPROP this_EString_2= ruleEString
            	    {

            	    				newCompositeNode(grammarAccess.getPropertiesAccess().getPARAM_SUBPROPParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    this_PARAM_SUBPROP_1=rulePARAM_SUBPROP();

            	    state._fsp--;


            	    				current.merge(this_PARAM_SUBPROP_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getPropertiesAccess().getEStringParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    				current.merge(this_EString_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleEString"
    // InternalModelQueryLanguageTextual.g:1245:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModelQueryLanguageTextual.g:1245:47: (iv_ruleEString= ruleEString EOF )
            // InternalModelQueryLanguageTextual.g:1246:2: iv_ruleEString= ruleEString EOF
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
    // InternalModelQueryLanguageTextual.g:1252:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1258:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModelQueryLanguageTextual.g:1259:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModelQueryLanguageTextual.g:1259:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:1260:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:1268:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleCONTAINER_DELIM_LEFT"
    // InternalModelQueryLanguageTextual.g:1279:1: entryRuleCONTAINER_DELIM_LEFT returns [String current=null] : iv_ruleCONTAINER_DELIM_LEFT= ruleCONTAINER_DELIM_LEFT EOF ;
    public final String entryRuleCONTAINER_DELIM_LEFT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTAINER_DELIM_LEFT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1279:60: (iv_ruleCONTAINER_DELIM_LEFT= ruleCONTAINER_DELIM_LEFT EOF )
            // InternalModelQueryLanguageTextual.g:1280:2: iv_ruleCONTAINER_DELIM_LEFT= ruleCONTAINER_DELIM_LEFT EOF
            {
             newCompositeNode(grammarAccess.getCONTAINER_DELIM_LEFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONTAINER_DELIM_LEFT=ruleCONTAINER_DELIM_LEFT();

            state._fsp--;

             current =iv_ruleCONTAINER_DELIM_LEFT.getText(); 
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
    // $ANTLR end "entryRuleCONTAINER_DELIM_LEFT"


    // $ANTLR start "ruleCONTAINER_DELIM_LEFT"
    // InternalModelQueryLanguageTextual.g:1286:1: ruleCONTAINER_DELIM_LEFT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleCONTAINER_DELIM_LEFT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1292:2: (kw= '{' )
            // InternalModelQueryLanguageTextual.g:1293:2: kw= '{'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCONTAINER_DELIM_LEFTAccess().getLeftCurlyBracketKeyword());
            	

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
    // $ANTLR end "ruleCONTAINER_DELIM_LEFT"


    // $ANTLR start "entryRuleCONTAINER_DELIM_RIGHT"
    // InternalModelQueryLanguageTextual.g:1301:1: entryRuleCONTAINER_DELIM_RIGHT returns [String current=null] : iv_ruleCONTAINER_DELIM_RIGHT= ruleCONTAINER_DELIM_RIGHT EOF ;
    public final String entryRuleCONTAINER_DELIM_RIGHT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTAINER_DELIM_RIGHT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1301:61: (iv_ruleCONTAINER_DELIM_RIGHT= ruleCONTAINER_DELIM_RIGHT EOF )
            // InternalModelQueryLanguageTextual.g:1302:2: iv_ruleCONTAINER_DELIM_RIGHT= ruleCONTAINER_DELIM_RIGHT EOF
            {
             newCompositeNode(grammarAccess.getCONTAINER_DELIM_RIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONTAINER_DELIM_RIGHT=ruleCONTAINER_DELIM_RIGHT();

            state._fsp--;

             current =iv_ruleCONTAINER_DELIM_RIGHT.getText(); 
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
    // $ANTLR end "entryRuleCONTAINER_DELIM_RIGHT"


    // $ANTLR start "ruleCONTAINER_DELIM_RIGHT"
    // InternalModelQueryLanguageTextual.g:1308:1: ruleCONTAINER_DELIM_RIGHT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleCONTAINER_DELIM_RIGHT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1314:2: (kw= '}' )
            // InternalModelQueryLanguageTextual.g:1315:2: kw= '}'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCONTAINER_DELIM_RIGHTAccess().getRightCurlyBracketKeyword());
            	

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
    // $ANTLR end "ruleCONTAINER_DELIM_RIGHT"


    // $ANTLR start "entryRuleSUBJECT_DELIM_LEFT"
    // InternalModelQueryLanguageTextual.g:1323:1: entryRuleSUBJECT_DELIM_LEFT returns [String current=null] : iv_ruleSUBJECT_DELIM_LEFT= ruleSUBJECT_DELIM_LEFT EOF ;
    public final String entryRuleSUBJECT_DELIM_LEFT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSUBJECT_DELIM_LEFT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1323:58: (iv_ruleSUBJECT_DELIM_LEFT= ruleSUBJECT_DELIM_LEFT EOF )
            // InternalModelQueryLanguageTextual.g:1324:2: iv_ruleSUBJECT_DELIM_LEFT= ruleSUBJECT_DELIM_LEFT EOF
            {
             newCompositeNode(grammarAccess.getSUBJECT_DELIM_LEFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUBJECT_DELIM_LEFT=ruleSUBJECT_DELIM_LEFT();

            state._fsp--;

             current =iv_ruleSUBJECT_DELIM_LEFT.getText(); 
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
    // $ANTLR end "entryRuleSUBJECT_DELIM_LEFT"


    // $ANTLR start "ruleSUBJECT_DELIM_LEFT"
    // InternalModelQueryLanguageTextual.g:1330:1: ruleSUBJECT_DELIM_LEFT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '[' ;
    public final AntlrDatatypeRuleToken ruleSUBJECT_DELIM_LEFT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1336:2: (kw= '[' )
            // InternalModelQueryLanguageTextual.g:1337:2: kw= '['
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSUBJECT_DELIM_LEFTAccess().getLeftSquareBracketKeyword());
            	

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
    // $ANTLR end "ruleSUBJECT_DELIM_LEFT"


    // $ANTLR start "entryRuleSUBJECT_DELIM_RIGHT"
    // InternalModelQueryLanguageTextual.g:1345:1: entryRuleSUBJECT_DELIM_RIGHT returns [String current=null] : iv_ruleSUBJECT_DELIM_RIGHT= ruleSUBJECT_DELIM_RIGHT EOF ;
    public final String entryRuleSUBJECT_DELIM_RIGHT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSUBJECT_DELIM_RIGHT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1345:59: (iv_ruleSUBJECT_DELIM_RIGHT= ruleSUBJECT_DELIM_RIGHT EOF )
            // InternalModelQueryLanguageTextual.g:1346:2: iv_ruleSUBJECT_DELIM_RIGHT= ruleSUBJECT_DELIM_RIGHT EOF
            {
             newCompositeNode(grammarAccess.getSUBJECT_DELIM_RIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUBJECT_DELIM_RIGHT=ruleSUBJECT_DELIM_RIGHT();

            state._fsp--;

             current =iv_ruleSUBJECT_DELIM_RIGHT.getText(); 
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
    // $ANTLR end "entryRuleSUBJECT_DELIM_RIGHT"


    // $ANTLR start "ruleSUBJECT_DELIM_RIGHT"
    // InternalModelQueryLanguageTextual.g:1352:1: ruleSUBJECT_DELIM_RIGHT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ']' ;
    public final AntlrDatatypeRuleToken ruleSUBJECT_DELIM_RIGHT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1358:2: (kw= ']' )
            // InternalModelQueryLanguageTextual.g:1359:2: kw= ']'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSUBJECT_DELIM_RIGHTAccess().getRightSquareBracketKeyword());
            	

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
    // $ANTLR end "ruleSUBJECT_DELIM_RIGHT"


    // $ANTLR start "entryRuleELEM_SEPARATOR"
    // InternalModelQueryLanguageTextual.g:1367:1: entryRuleELEM_SEPARATOR returns [String current=null] : iv_ruleELEM_SEPARATOR= ruleELEM_SEPARATOR EOF ;
    public final String entryRuleELEM_SEPARATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEM_SEPARATOR = null;


        try {
            // InternalModelQueryLanguageTextual.g:1367:54: (iv_ruleELEM_SEPARATOR= ruleELEM_SEPARATOR EOF )
            // InternalModelQueryLanguageTextual.g:1368:2: iv_ruleELEM_SEPARATOR= ruleELEM_SEPARATOR EOF
            {
             newCompositeNode(grammarAccess.getELEM_SEPARATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEM_SEPARATOR=ruleELEM_SEPARATOR();

            state._fsp--;

             current =iv_ruleELEM_SEPARATOR.getText(); 
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
    // $ANTLR end "entryRuleELEM_SEPARATOR"


    // $ANTLR start "ruleELEM_SEPARATOR"
    // InternalModelQueryLanguageTextual.g:1374:1: ruleELEM_SEPARATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleELEM_SEPARATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1380:2: (kw= ',' )
            // InternalModelQueryLanguageTextual.g:1381:2: kw= ','
            {
            kw=(Token)match(input,35,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getELEM_SEPARATORAccess().getCommaKeyword());
            	

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
    // $ANTLR end "ruleELEM_SEPARATOR"


    // $ANTLR start "entryRuleQUERY_END"
    // InternalModelQueryLanguageTextual.g:1389:1: entryRuleQUERY_END returns [String current=null] : iv_ruleQUERY_END= ruleQUERY_END EOF ;
    public final String entryRuleQUERY_END() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUERY_END = null;


        try {
            // InternalModelQueryLanguageTextual.g:1389:49: (iv_ruleQUERY_END= ruleQUERY_END EOF )
            // InternalModelQueryLanguageTextual.g:1390:2: iv_ruleQUERY_END= ruleQUERY_END EOF
            {
             newCompositeNode(grammarAccess.getQUERY_ENDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQUERY_END=ruleQUERY_END();

            state._fsp--;

             current =iv_ruleQUERY_END.getText(); 
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
    // $ANTLR end "entryRuleQUERY_END"


    // $ANTLR start "ruleQUERY_END"
    // InternalModelQueryLanguageTextual.g:1396:1: ruleQUERY_END returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleQUERY_END() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1402:2: (kw= '?' )
            // InternalModelQueryLanguageTextual.g:1403:2: kw= '?'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getQUERY_ENDAccess().getQuestionMarkKeyword());
            	

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
    // $ANTLR end "ruleQUERY_END"


    // $ANTLR start "entryRulePARAM_EQ"
    // InternalModelQueryLanguageTextual.g:1411:1: entryRulePARAM_EQ returns [String current=null] : iv_rulePARAM_EQ= rulePARAM_EQ EOF ;
    public final String entryRulePARAM_EQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM_EQ = null;


        try {
            // InternalModelQueryLanguageTextual.g:1411:48: (iv_rulePARAM_EQ= rulePARAM_EQ EOF )
            // InternalModelQueryLanguageTextual.g:1412:2: iv_rulePARAM_EQ= rulePARAM_EQ EOF
            {
             newCompositeNode(grammarAccess.getPARAM_EQRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAM_EQ=rulePARAM_EQ();

            state._fsp--;

             current =iv_rulePARAM_EQ.getText(); 
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
    // $ANTLR end "entryRulePARAM_EQ"


    // $ANTLR start "rulePARAM_EQ"
    // InternalModelQueryLanguageTextual.g:1418:1: rulePARAM_EQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken rulePARAM_EQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1424:2: (kw= '=' )
            // InternalModelQueryLanguageTextual.g:1425:2: kw= '='
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPARAM_EQAccess().getEqualsSignKeyword());
            	

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
    // $ANTLR end "rulePARAM_EQ"


    // $ANTLR start "entryRulePARAM_LT"
    // InternalModelQueryLanguageTextual.g:1433:1: entryRulePARAM_LT returns [String current=null] : iv_rulePARAM_LT= rulePARAM_LT EOF ;
    public final String entryRulePARAM_LT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM_LT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1433:48: (iv_rulePARAM_LT= rulePARAM_LT EOF )
            // InternalModelQueryLanguageTextual.g:1434:2: iv_rulePARAM_LT= rulePARAM_LT EOF
            {
             newCompositeNode(grammarAccess.getPARAM_LTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAM_LT=rulePARAM_LT();

            state._fsp--;

             current =iv_rulePARAM_LT.getText(); 
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
    // $ANTLR end "entryRulePARAM_LT"


    // $ANTLR start "rulePARAM_LT"
    // InternalModelQueryLanguageTextual.g:1440:1: rulePARAM_LT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<' ;
    public final AntlrDatatypeRuleToken rulePARAM_LT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1446:2: (kw= '<' )
            // InternalModelQueryLanguageTextual.g:1447:2: kw= '<'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPARAM_LTAccess().getLessThanSignKeyword());
            	

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
    // $ANTLR end "rulePARAM_LT"


    // $ANTLR start "entryRulePARAM_GT"
    // InternalModelQueryLanguageTextual.g:1455:1: entryRulePARAM_GT returns [String current=null] : iv_rulePARAM_GT= rulePARAM_GT EOF ;
    public final String entryRulePARAM_GT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM_GT = null;


        try {
            // InternalModelQueryLanguageTextual.g:1455:48: (iv_rulePARAM_GT= rulePARAM_GT EOF )
            // InternalModelQueryLanguageTextual.g:1456:2: iv_rulePARAM_GT= rulePARAM_GT EOF
            {
             newCompositeNode(grammarAccess.getPARAM_GTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAM_GT=rulePARAM_GT();

            state._fsp--;

             current =iv_rulePARAM_GT.getText(); 
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
    // $ANTLR end "entryRulePARAM_GT"


    // $ANTLR start "rulePARAM_GT"
    // InternalModelQueryLanguageTextual.g:1462:1: rulePARAM_GT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '>' ;
    public final AntlrDatatypeRuleToken rulePARAM_GT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1468:2: (kw= '>' )
            // InternalModelQueryLanguageTextual.g:1469:2: kw= '>'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPARAM_GTAccess().getGreaterThanSignKeyword());
            	

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
    // $ANTLR end "rulePARAM_GT"


    // $ANTLR start "entryRulePARAM_NE"
    // InternalModelQueryLanguageTextual.g:1477:1: entryRulePARAM_NE returns [String current=null] : iv_rulePARAM_NE= rulePARAM_NE EOF ;
    public final String entryRulePARAM_NE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM_NE = null;


        try {
            // InternalModelQueryLanguageTextual.g:1477:48: (iv_rulePARAM_NE= rulePARAM_NE EOF )
            // InternalModelQueryLanguageTextual.g:1478:2: iv_rulePARAM_NE= rulePARAM_NE EOF
            {
             newCompositeNode(grammarAccess.getPARAM_NERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAM_NE=rulePARAM_NE();

            state._fsp--;

             current =iv_rulePARAM_NE.getText(); 
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
    // $ANTLR end "entryRulePARAM_NE"


    // $ANTLR start "rulePARAM_NE"
    // InternalModelQueryLanguageTextual.g:1484:1: rulePARAM_NE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken rulePARAM_NE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1490:2: (kw= '!=' )
            // InternalModelQueryLanguageTextual.g:1491:2: kw= '!='
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPARAM_NEAccess().getExclamationMarkEqualsSignKeyword());
            	

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
    // $ANTLR end "rulePARAM_NE"


    // $ANTLR start "entryRulePARAM_SUBPROP"
    // InternalModelQueryLanguageTextual.g:1499:1: entryRulePARAM_SUBPROP returns [String current=null] : iv_rulePARAM_SUBPROP= rulePARAM_SUBPROP EOF ;
    public final String entryRulePARAM_SUBPROP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM_SUBPROP = null;


        try {
            // InternalModelQueryLanguageTextual.g:1499:53: (iv_rulePARAM_SUBPROP= rulePARAM_SUBPROP EOF )
            // InternalModelQueryLanguageTextual.g:1500:2: iv_rulePARAM_SUBPROP= rulePARAM_SUBPROP EOF
            {
             newCompositeNode(grammarAccess.getPARAM_SUBPROPRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAM_SUBPROP=rulePARAM_SUBPROP();

            state._fsp--;

             current =iv_rulePARAM_SUBPROP.getText(); 
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
    // $ANTLR end "entryRulePARAM_SUBPROP"


    // $ANTLR start "rulePARAM_SUBPROP"
    // InternalModelQueryLanguageTextual.g:1506:1: rulePARAM_SUBPROP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken rulePARAM_SUBPROP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1512:2: (kw= '.' )
            // InternalModelQueryLanguageTextual.g:1513:2: kw= '.'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPARAM_SUBPROPAccess().getFullStopKeyword());
            	

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
    // $ANTLR end "rulePARAM_SUBPROP"


    // $ANTLR start "ruleOperator"
    // InternalModelQueryLanguageTextual.g:1521:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'WHO' ) | (enumLiteral_1= 'WHEN' ) | (enumLiteral_2= 'WHAT' ) | (enumLiteral_3= 'WHERE' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1527:2: ( ( (enumLiteral_0= 'WHO' ) | (enumLiteral_1= 'WHEN' ) | (enumLiteral_2= 'WHAT' ) | (enumLiteral_3= 'WHERE' ) ) )
            // InternalModelQueryLanguageTextual.g:1528:2: ( (enumLiteral_0= 'WHO' ) | (enumLiteral_1= 'WHEN' ) | (enumLiteral_2= 'WHAT' ) | (enumLiteral_3= 'WHERE' ) )
            {
            // InternalModelQueryLanguageTextual.g:1528:2: ( (enumLiteral_0= 'WHO' ) | (enumLiteral_1= 'WHEN' ) | (enumLiteral_2= 'WHAT' ) | (enumLiteral_3= 'WHERE' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt30=1;
                }
                break;
            case 43:
                {
                alt30=2;
                }
                break;
            case 44:
                {
                alt30=3;
                }
                break;
            case 45:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalModelQueryLanguageTextual.g:1529:3: (enumLiteral_0= 'WHO' )
                    {
                    // InternalModelQueryLanguageTextual.g:1529:3: (enumLiteral_0= 'WHO' )
                    // InternalModelQueryLanguageTextual.g:1530:4: enumLiteral_0= 'WHO'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getWHOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getWHOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModelQueryLanguageTextual.g:1537:3: (enumLiteral_1= 'WHEN' )
                    {
                    // InternalModelQueryLanguageTextual.g:1537:3: (enumLiteral_1= 'WHEN' )
                    // InternalModelQueryLanguageTextual.g:1538:4: enumLiteral_1= 'WHEN'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getWHENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getWHENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModelQueryLanguageTextual.g:1545:3: (enumLiteral_2= 'WHAT' )
                    {
                    // InternalModelQueryLanguageTextual.g:1545:3: (enumLiteral_2= 'WHAT' )
                    // InternalModelQueryLanguageTextual.g:1546:4: enumLiteral_2= 'WHAT'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getWHATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getWHATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModelQueryLanguageTextual.g:1553:3: (enumLiteral_3= 'WHERE' )
                    {
                    // InternalModelQueryLanguageTextual.g:1553:3: (enumLiteral_3= 'WHERE' )
                    // InternalModelQueryLanguageTextual.g:1554:4: enumLiteral_3= 'WHERE'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getWHEREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getWHEREEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleWhereSyn"
    // InternalModelQueryLanguageTextual.g:1564:1: ruleWhereSyn returns [Enumerator current=null] : (enumLiteral_0= 'DESCRIPTION' ) ;
    public final Enumerator ruleWhereSyn() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalModelQueryLanguageTextual.g:1570:2: ( (enumLiteral_0= 'DESCRIPTION' ) )
            // InternalModelQueryLanguageTextual.g:1571:2: (enumLiteral_0= 'DESCRIPTION' )
            {
            // InternalModelQueryLanguageTextual.g:1571:2: (enumLiteral_0= 'DESCRIPTION' )
            // InternalModelQueryLanguageTextual.g:1572:3: enumLiteral_0= 'DESCRIPTION'
            {
            enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

            			current = grammarAccess.getWhereSynAccess().getWHEREEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getWhereSynAccess().getWHEREEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleWhereSyn"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\52\5\13\4\uffff";
    static final String dfa_3s = "\1\56\5\36\4\uffff";
    static final String dfa_4s = "\6\uffff\1\1\1\3\1\2\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\2\6\2\uffff\3\10\4\uffff\1\7\5\uffff\3\11",
            "\2\6\2\uffff\3\10\4\uffff\1\7\5\uffff\3\11",
            "\2\6\2\uffff\3\10\4\uffff\1\7\5\uffff\3\11",
            "\2\6\2\uffff\3\10\4\uffff\1\7\5\uffff\3\11",
            "\2\6\2\uffff\3\10\4\uffff\1\7\5\uffff\3\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "90:6: (lv_queries_1_1= ruleModelQueryHeadParent | lv_queries_1_2= ruleModelQueryNextFromTo | lv_queries_1_3= ruleModelQueryModel | lv_queries_1_4= ruleModelQueryModelContents )";
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "167:7: (lv_queries_3_1= ruleModelQueryHeadParent | lv_queries_3_2= ruleModelQueryNextFromTo | lv_queries_3_3= ruleModelQueryModel | lv_queries_3_4= ruleModelQueryModelContents )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000002L});

}