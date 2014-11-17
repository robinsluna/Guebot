package com.guebot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.guebot.task.EnviarTask;

public class MainActivity extends Activity {

	ImageView imageView;
	Button buttonAbajo;
	Button buttonArriba;
	Button buttonAgarrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView = (ImageView) this.findViewById(R.id.imageView);
		buttonAbajo = (Button) this.findViewById(R.id.button_abajo);
		buttonArriba = (Button) this.findViewById(R.id.button_arriba);
		buttonAgarrar = (Button) this.findViewById(R.id.button_agarrar);

		//
		buttonAbajo.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				new EnviarTask(MainActivity.this, imageView,
						R.drawable.ic_abajo).execute((Void) null);
				
			}
		});
		buttonArriba.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				new EnviarTask(MainActivity.this, imageView,
						R.drawable.ic_arriba).execute((Void) null);
			}
		});
		buttonAgarrar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				new EnviarTask(MainActivity.this, imageView,
						R.drawable.ic_agarro).execute((Void) null);
			}
		});
	}

}
