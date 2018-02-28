/*
S3C7
Sam Wang William Lu
Mr.Daniel
This is our group's winter holiday homework
 */
package testyourvocabularysize;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestYourVocabularySize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, welcome to our Test Your Vocabulary Size\n "
                + "program. This program is aiming for testing your English\n"
                + "vocabulary size by evaluating your grades of the questions\n "
                + "we will give you late. You can get a general sense about\n "
                + "your vocabulary size after finishing this test.");
        System.out.println();
                     
        String q1 = "What is the synonym of love?\n"
                + "(a)left\n(b)life\n(c)live\n(d)like";
        String q2 = "What is the synonym of much?\n"
                + "(a)less\n(b)many\n(c)rather\n(d)deal";
        String q3 = "What is the synonym of child?\n"
                + "(a)kid\n(b)chill\n(c)call\n(d)forget";
        String q4 = "What is the synonym of large?\n"
                + "(a)tiny\n(b)faded\n(c)new\n(d)big";
        String q5 = "What is the synonym of deal?\n"
                + "(a)sale\n(b)recoup\n(c)claim\n(d)plea";
        String q6 = "What is the synonym of companion?\n"
                + "(a)fool\n(b)mirror\n(c)entrapment\n(d)partner";
        String q7 = "What is the synonym of trash?\n"
                + "(a)crack\n(b)squeeze\n(c)punch\n(d)junk";
        String q8 = "What is the synonym of above?\n"
                + "(a)pierce\n(b)slow\n(c)over\n(d)work";
        String q9 = "What is the synonym of specify?\n"
                + "(a)designate\n(b)capitulate\n(c)arcane\n(d)assail";
        String q10 = "What is the synonym of fall?\n"
                + "(a)spit\n(b)squeal\n(c)drop\n(d)succeed";
        String q11 = "What is the antonym of old?\n"
                + "(a)tell\n(b)small\n(c)age\n(d)new";
        String q12 = "What is the antonym of yes?\n"
                + "(a)notice\n(b)yep\n(c)no\n(d)nice";
        String q13 = "What is the antonym of come?\n"
                + "(a)try\n(b)most\n(c)go\n(d)live";
        String q14 = "What is the synonym of fly?\n"
                + "(a)hop\n(b)peer\n(c)drink\n(d)soar";
        String q15 = "What is the antonym of active?\n"
                + "(a)unable\n(b)passive\n(c)inability\n(d)disagree";
        String q16 = "What is the antonym of dangerous?\n"
                + "(a)sily\n(b)careless\n(c)safe\n(d)sadness";
        String q17 = "What is the antonym of distant?\n"
                + "(a)disease\n(b)flex\n(c)obey\n(d)near";
        String q18 = "What is the antonym of narrow?\n"
                + "(a)scold\n(b)punish\n(c)near\n(d)broad";
        String q19 = "What is the antonym of seperate?\n"
                + "(a)weak\n(b)ordinary\n(c)unite\n(d)break";
        String q20 = "What is the antonym of normal?\n"
                + "(a)doubt\n(b)standard\n(c)protracted\n(d)extrodinary";
        String q21 = "What is the synonym of spade?\n"
                + "(a)shovel\n(b)needle\n(c)club\n(d)oak";
        String q22 = "What is the synonym of done?\n"
                + "(a)embellished\n(b)squeaked\n(c)finished\n(d)talked";
        String q23 = "What is the synonym of beg?\n"
                + "(a)implore\n(b)recant\n(c)fancy\n(d)answer";
        String q24 = "What is the synonym of lax?\n"
                + "(a)negligent\n(b)mindful\n(c)neurotic\n(d)delectable";
        String q25 = "What is the synonym of quash?\n"
                + "(a)evade\n(b)enumerate\n(c)assist\n(d)defeat";
        String q26 = "What is the synonym of minor?\n"
                + "(a)crude\n(b)trivial\n(c)presidential\n(d)flow";
        String q27 = "What is the synonym of drab?\n"
                + "(a)admissible\n(b)barbaric\n(c)spiffy\n(d)lackluster";
        String q28 = "What is the synonym of related?\n"
                + "(a)steadfast\n(b)pertinent\n(c)alien\n(d)intrinsic";
        String q29 = "What is the synonym of annoying?\n"
                + "(a)facile\n(b)clicker\n(c)counter\n(d)obnoxious";
        String q30 = "What is the synonym of incipient?\n"
                + "(a)galling\n(b)nascent\n(c)chromatic\n(d)capricious";
        String q31 = "What is the antonym of foul?\n"
                + "(a)repelling\n(b)nasty\n(c)fair\n(d)dirty";
        String q32 = "What is the antonym of compensate?\n"
                + "(a)underplay\n(b)coordinate\n(c)extortion\n(d)hooking";
        String q33 = "What is the antonym of acquiesce?\n"
                + "(a)inept\n(b)resist\n(c)gentle\n(d)irascible";
        String q34 = "What is the antonym of adamant?\n"
                + "(a)disdain\n(b)adjunct\n(c)vacillant\n(d)aerate";
        String q35 = "What is the antonym of alienate?\n"
                + "(a)renuite\n(b)away\n(c)sluggish\n(d)aggressive";
        String q36 = "What is the antonym of avulse?\n"
                + "(a)suture\n(b)aver\n(c)timid\n(d)dry";
        String q37 = "What is the antonym of catalyst?\n"
                + "(a)current\n(b)damp\n(c)nadir\n(d)prevention";
        String q38 = "What is the antonym of amorphous?\n"
                + "(a)allay\n(b)abrideg\n(c)inimical\n(d)definite";
        String q39 = "What is the antonym of aggrieved?\n"
                + "(a)recalcitrant\n(b)buoyant\n(c)warped\n(d)exacerbate";
        String q40 = "What is the antonym of apologist?\n"
                + "(a)physicist\n(b)critic\n(c)fidelity\n(d)canon";
        String q41 = "What is the synonym of widow?\n"
                + "(a)sire\n(b)fiend\n(c)spank\n(d)dowager";
        String q42 = "What is the synonym of omen?\n"
                + "(a)opulence\n(b)harbinger\n(c)mystic\n(d)demand";
        String q43 = "What is the synonym of querulous?\n"
                + "(a)fugacious\n(b)vapid\n(c)fractious\n(d)extemporaneous";
        String q44 = "What is the synonym of hightail?\n"
                + "(a)abscond\n(b)report\n(c)perturb\n(d)surmise";
        String q45 = "What is the synonym of gargantuan?\n"
                + "(a)promiscuous\n(b)virtuous\n(c)equestrian\n(d)titanic";
        String q46 = "What is the antonym of avarice?\n"
                + "(a)deny\n(b)dependence\n(c)generosity\n(d)yoke";
        String q47 = "What is the antonym of alacrity?\n"
                + "(a)intimate\n(b)provoker\n(c)soother\n(d)sluggishness";
        String q48 = "What is the antonym of altruism?\n"
                + "(a)apocrypha\n(b)noisome\n(c)egoism\n(d)extraneous";
        String q49 = "What is the antonym of affinity?\n"
                + "(a)disperse\n(b)antipathy\n(c)needy\n(d)warped";
        String q50 = "What is the antonym of baneful?\n"
                + "(a)blighted\n(b)jejune\n(c)inveigled\n(d)salubrious";
        
        VocabularyQuestion[] questions={
            new VocabularyQuestion(q1,"d"),
            new VocabularyQuestion(q2,"b"),
            new VocabularyQuestion(q3,"a"),
            new VocabularyQuestion(q4,"d"),
            new VocabularyQuestion(q5,"a"),
            new VocabularyQuestion(q6,"d"),
            new VocabularyQuestion(q7,"d"),
            new VocabularyQuestion(q8,"c"),
            new VocabularyQuestion(q9,"a"),
            new VocabularyQuestion(q10,"c"),
            new VocabularyQuestion(q11,"d"),
            new VocabularyQuestion(q12,"c"),
            new VocabularyQuestion(q13,"c"),
            new VocabularyQuestion(q14,"d"),
            new VocabularyQuestion(q15,"b"),
            new VocabularyQuestion(q16,"c"),
            new VocabularyQuestion(q17,"d"),
            new VocabularyQuestion(q18,"d"),
            new VocabularyQuestion(q19,"c"),
            new VocabularyQuestion(q20,"d"),
            new VocabularyQuestion(q21,"a"),
            new VocabularyQuestion(q22,"c"),
            new VocabularyQuestion(q23,"a"),
            new VocabularyQuestion(q24,"a"),
            new VocabularyQuestion(q25,"d"),
            new VocabularyQuestion(q26,"b"),
            new VocabularyQuestion(q27,"d"),
            new VocabularyQuestion(q28,"b"),
            new VocabularyQuestion(q29,"d"),
            new VocabularyQuestion(q30,"b"),
            new VocabularyQuestion(q31,"c"),
            new VocabularyQuestion(q32,"d"),
            new VocabularyQuestion(q33,"b"),
            new VocabularyQuestion(q34,"c"),
            new VocabularyQuestion(q35,"a"),
            new VocabularyQuestion(q36,"a"),
            new VocabularyQuestion(q37,"d"),
            new VocabularyQuestion(q38,"d"),
            new VocabularyQuestion(q39,"b"),
            new VocabularyQuestion(q40,"b"),
            new VocabularyQuestion(q41,"d"),
            new VocabularyQuestion(q42,"b"),
            new VocabularyQuestion(q43,"c"),
            new VocabularyQuestion(q44,"a"),
            new VocabularyQuestion(q45,"d"),
            new VocabularyQuestion(q46,"c"),
            new VocabularyQuestion(q47,"d"),
            new VocabularyQuestion(q48,"c"),
            new VocabularyQuestion(q49,"b"),
            new VocabularyQuestion(q50,"d"),
        };
        takeTest(questions);
    }

     public static void takeTest(VocabularyQuestion[]questions){
        int score=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i< questions.length;i++){
            System.out.println(questions[i].prompt);
            String answer=input.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got "+ score+"/50");
        if (score>=0&&score<=10)
            System.out.println("Evaluation: Your vocabulary size is like that of a "
                    +"3-year-old kid in the native English speaking country.");
        if (score>10&&score<=20)
            System.out.println("Evaluation: Your vocabulary size is like that of a "
                    + "elementary school student in the native English "
                    + "speaking country.");
        if (score>20&&score<=30)
            System.out.println("Evaluation: Your vocabulary size is like that of a "
                    + "middle school student in the native English speaking "
                    + "country.");
        if (score>30&&score<=40)
            System.out.println("Evaluation: Your vocabulary size is like that of a "
                    + "college student in the native English speaking country.");
        if (score>40&&score<=50)
            System.out.println("Evaluation: Your vocabulary size is like that of a "
                    + "college student major in English Literature.");
         }
  }
