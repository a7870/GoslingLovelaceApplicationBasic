package com.lancer.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int orientation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orientation = getResources().getConfiguration().orientation;
        if(orientation == getResources().getConfiguration().ORIENTATION_LANDSCAPE)
            setContentView(R.layout.layout_land);
        if(orientation == getResources().getConfiguration().ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_main);
        change_introduce();
    }

    public void change_introduce(){
        Configuration mConfiguration = this.getResources().getConfiguration();//获取设置的配置信息
        int ori = mConfiguration.orientation; //获取屏幕方向
        if (ori == mConfiguration.ORIENTATION_LANDSCAPE) {
            //横屏
            TextView name = (TextView)findViewById(R.id.tv_name);
            name.setText("James Gosling");
            name.setTextSize(30f);
            ImageView image = (ImageView)findViewById(R.id.iv_picture);
            image.setImageDrawable(getResources().getDrawable((R.drawable.james_gosling)));
            LinearLayout ll = (LinearLayout) this.findViewById(R.id.ll_introduce);
            final TextView tv_intro = new TextView(this);
            tv_intro.setText("James Gosling received a Bachelor of Science from the University of Calgary and his M.A. and Ph.D. from Carnegie Mellon University. He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                    "\n" +
                    "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation, citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges. He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\" He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\" However, he approved of the court's ruling that APIs should not be copyrightable.\n" +
                    "\n" +
                    "In March 2011, Gosling left Oracle to work at Google. Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was aquired by Boeing. Following the aquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.\n" +
                    "\n" +
                    "He is an adviser at the Scala company Typesafe Inc. Independent Director at Jelastic, and Strategic Advisor for Eucalyptus, and is a board member of DIRTT Environmental Solutions。\n" +
                    "\n" +
                    "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.\n");
            tv_intro.setTextColor(Color.BLACK);
            tv_intro.setTextSize(20f);
            ll.addView(tv_intro);
        } else if (ori == mConfiguration.ORIENTATION_PORTRAIT) {
            //竖屏
            TextView name = (TextView)findViewById(R.id.tv_name);
            name.setText("Ada Lovelace");
            name.setTextSize(30f);
            ImageView image = (ImageView)findViewById(R.id.iv_picture);
            image.setImageDrawable(getResources().getDrawable((R.drawable.ada_lovelace)));
            LinearLayout ll = (LinearLayout) this.findViewById(R.id.ll_introduce);
            final TextView tv_intro = new TextView(this);
            tv_intro.setText("Augusta Ada King-Noel, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a \"computing machine\" and the first computer programmer.\n" +
                    "\n" +
                    "Ada Lovelace was the only legitimate child of the poet Lord Byron, and his wife Anne Isabella Milbanke (\"Annabella\"), Lady Wentworth. All of Byron's other children were born out of wedlock to other women. Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, \"Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart?\". He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, and Ada in turn became Countess of Lovelace.\n" +
                    "\n" +
                    "Her educational and social exploits brought her into contact with scientists such as Andrew Crosse, Sir David Brewster, Charles Wheatstone, Michael Faraday and the author Charles Dickens, which she used to further her education. Ada described her approach as \"poetical science\" and herself as an \"Analyst (& Metaphysician)\".\n" +
                    "\n" +
                    "When she was a teenager, her mathematical talents led her to a long working relationship and friendship with fellow British mathematician Charles Babbage, also known as \"the father of computers\", and in particular, Babbage's work on the Analytical Engine. Lovelace first met him in June 1833, through their mutual friend, and her private tutor, Mary Somerville.\n" +
                    "\n" +
                    "Between 1842 and 1843, Ada translated an article by Italian military engineer Luigi Menabrea on the engine, which she supplemented with an elaborate set of notes, simply called Notes. These notes contain what many consider to be the first computer program—that is, an algorithm designed to be carried out by a machine. Lovelace's notes are important in the early history of computers. She also developed a vision of the capability of computers to go beyond mere calculating or number-crunching, while many others, including Babbage himself, focused only on those capabilities. Her mindset of \"poetical science\" led her to ask questions about the Analytical Engine (as shown in her notes) examining how individuals and society relate to technology as a collaborative tool.\n" +
                    "\n" +
                    "She died of uterine cancer in 1852 at the age of 36.\n");
            tv_intro.setTextColor(Color.BLACK);
            tv_intro.setTextSize(20f);
            ll.addView(tv_intro);
        }
    }
}
