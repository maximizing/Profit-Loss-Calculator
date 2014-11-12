package app.buusk15.quiz01repair02_797;

import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculated extends Activity implements OnClickListener {
	private String gete1, gete2, gete3;
	double result2, percent, baht, cost2, e2, e3, result1, con, cost1;
	private Integer e1;
	private TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13,
			t14, t15, t16;
	private Button btnup, btnlow,btnback,btnclose;
	private double c = 0;
	private double cc = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculated);
		setFont();
		btnup.setOnClickListener(this);
		btnlow.setOnClickListener(this);
		btnback.setOnClickListener(this);
		btnclose.setOnClickListener(this);
	}

	public void setFont() {
		t1 = (TextView) findViewById(R.id.txtcal1);
		t2 = (TextView) findViewById(R.id.txtcal2);
		t3 = (TextView) findViewById(R.id.txtcal3);
		t4 = (TextView) findViewById(R.id.txtcal4);
		t5 = (TextView) findViewById(R.id.txtcal5);
		t6 = (TextView) findViewById(R.id.txtcal6);
		t7 = (TextView) findViewById(R.id.txtcal7);
		t8 = (TextView) findViewById(R.id.txtcal8);
		t9 = (TextView) findViewById(R.id.txtcal9);
		t10 = (TextView) findViewById(R.id.txtcal10);
		t11 = (TextView) findViewById(R.id.txtcal11);
		t12 = (TextView) findViewById(R.id.txtcal12);
		t13 = (TextView) findViewById(R.id.txtcal13);
		t14 = (TextView) findViewById(R.id.txtcal14);
		t15 = (TextView) findViewById(R.id.txtcal15);
		t16 = (TextView) findViewById(R.id.txtcal16);
		btnup = (Button) findViewById(R.id.btnup);
		btnlow = (Button) findViewById(R.id.btnlow);
		btnback = (Button) findViewById(R.id.btnback);
		btnclose = (Button) findViewById(R.id.btnclose);
		Calc(c, cc);
		Typeface thaifont = Typeface.createFromAsset(getAssets(),
				"fonts/THSarabun.ttf");
		t1.setTypeface(thaifont, Typeface.BOLD);
		t2.setTypeface(thaifont, Typeface.BOLD);
		t3.setTypeface(thaifont, Typeface.BOLD);
		t4.setTypeface(thaifont, Typeface.BOLD);
		t5.setTypeface(thaifont, Typeface.BOLD);
		t6.setTypeface(thaifont, Typeface.BOLD);
		t7.setTypeface(thaifont, Typeface.BOLD);
		t8.setTypeface(thaifont, Typeface.BOLD);
		t9.setTypeface(thaifont, Typeface.BOLD);
		btnup.setTypeface(thaifont, Typeface.BOLD);
		btnlow.setTypeface(thaifont, Typeface.BOLD);
		// t10.setTypeface(thaifont,Typeface.BOLD);
		// t11.setTypeface(thaifont,Typeface.BOLD);
		// t12.setTypeface(thaifont,Typeface.BOLD);
		// t13.setTypeface(thaifont,Typeface.BOLD);
		// t14.setTypeface(thaifont,Typeface.BOLD);
		// t15.setTypeface(thaifont,Typeface.BOLD);
		// t16.setTypeface(thaifont,Typeface.BOLD);
	}

	private Double Calc(double c2, double cc2) {

		con = (float) 53.50;
		gete1 = getIntent().getStringExtra("e1");
		gete2 = getIntent().getStringExtra("e2");
		gete3 = getIntent().getStringExtra("e3");
		e1 = Integer.parseInt(gete1);
		e2 = Double.valueOf(gete2).doubleValue();
		e3 = Double.valueOf(gete3).doubleValue();
		result1 = e1 * e2;
		result2 = e1 * (e3 + c2);
		// result2 = e1*(e3+update1);
		cost1 = result1 + con;
		// cost2 = result2-(con+update2);
		cost2 = result2 - con;
		baht = cost1 - (cost2 + cc2);
		percent = (baht / cost1) * 100;

		t1.setText("ผลการคำควณ: ");
		t2.setText("มูลค่าซื้อ:    " + e1 + " x " + e2 + "  =     ");
		t10.setText("" + result1);
		t3.setText("บวก ชำระค่าส่งคำสั่ง:");
		t11.setText("" + con);
		t4.setText("รวมต้นทุนค่าซื้อ:");
		t12.setText("" + cost1);
		t5.setText("มูลค่าขาย:   " + e1 + " x " + e3 + "  =     ");
		t13.setText("" + result2);
		t6.setText("หัก ชำระค่าส่งคำสั่ง:");
		t14.setText("" + con);
		t7.setText("คิดเป็นค่าขายสุทธิ:   ");
		t15.setText("" + cost2);
		t8.setText("ขาดทุน                                " + percent
				+ "% หรือ      ");
		t16.setText("" + baht);
		return null;

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnup:
			c = c + 0.02d;
			cc = cc + 53.50d;
			Calc(c, cc);

			break;
		case R.id.btnlow:
			c = c - 0.02d;
			cc = cc + 53.50d;
			Calc(c, cc);
			break;
		case R.id.btnback:
			Intent i = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(i);
			finish();

			break;
		case R.id.btnclose:
			finish();			
		default:
			break;
		}

	}
}
