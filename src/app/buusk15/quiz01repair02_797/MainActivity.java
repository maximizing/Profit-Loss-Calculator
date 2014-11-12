package app.buusk15.quiz01repair02_797;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnok;
	private EditText e1,e2,e3;
	private TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
	private String txte1,txte2,txte3;
	private RadioGroup r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnok = (Button) findViewById(R.id.btnok);
        e1 = (EditText) findViewById(R.id.e1_797);
        e2 = (EditText) findViewById(R.id.e2_797);
        e3 = (EditText) findViewById(R.id.e3_797);
        
        btnok.setOnClickListener(this);
        txt1 = (TextView) findViewById(R.id.txt1_797);
        txt2 = (TextView) findViewById(R.id.txt2_797);
        txt3 = (TextView) findViewById(R.id.txt3_797);
        txt4 = (TextView) findViewById(R.id.txt4_797);
        txt5 = (TextView) findViewById(R.id.txt5_797);
        txt6 = (TextView) findViewById(R.id.txt6_797);
        txt7 = (TextView) findViewById(R.id.txt7_797);
        setFont();
        txt1.setText("  ถ้าซื้อหลักทรัพย ์");
        txt2.setText(" หุ้น ");
        txt3.setText("  ที่ราคา ");
        txt4.setText(" และขาย ");
        txt5.setText("  ที่ราคา ");
        txt6.setText("    คิดเป็น \n กำไรขาดทุน ");
        txt7.setText(" อัตราค่านายหน้า ");
        
//        r1 = (RadioGroup) findViewById(R.id.r1);
//        r2 = (RadioGroup) findViewById(R.id.r2);
//        r3 = (RadioGroup) findViewById(R.id.r3);
        
        
    }
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btnok:
			txte1 = e1.getText().toString();
	        txte2 = e2.getText().toString();
	        txte3 = e3.getText().toString();
			Intent i = new Intent(getApplicationContext(),Calculated.class);
			i.putExtra("e1", txte1);			
			i.putExtra("e2", txte2);
			i.putExtra("e3", txte3);
			startActivity(i);			
		}
		
	}
public void setFont(){
	
	Typeface thaifont = Typeface.createFromAsset(getAssets(), "fonts/THSarabun.ttf");
	txt1.setTypeface(thaifont,Typeface.BOLD);
	txt2.setTypeface(thaifont,Typeface.BOLD);
	txt3.setTypeface(thaifont,Typeface.BOLD);
	txt4.setTypeface(thaifont,Typeface.BOLD);
	txt5.setTypeface(thaifont,Typeface.BOLD);
	txt6.setTypeface(thaifont,Typeface.BOLD);
	txt7.setTypeface(thaifont,Typeface.BOLD);
}
}
