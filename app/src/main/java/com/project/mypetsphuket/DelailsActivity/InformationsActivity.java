package com.project.mypetsphuket.DelailsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.mypetsphuket.Interface.ItemClickListner;
import com.project.mypetsphuket.Model.Informations;
import com.project.mypetsphuket.R;
import com.squareup.picasso.Picasso;

public class InformationsActivity extends AppCompatActivity {

    private ItemClickListner itemClickListner;
    private ImageView InformationImageView;
    private TextView InformationService;
    private TextView  InformationPhoneNumber;
    private TextView  InformationName;
    private TextView  InformationDescription;
    private TextView  InformationServicetime;
    private TextView  InformationLocation;
    private TextView  InformationRating;
    private TextView InformationDoctorService;
    private ImageView InformationStar1;
    private ImageView InformationStar2;
    private ImageView InformationStar3;
    private ImageView InformationStar4;
    private ImageView InformationStar5;
    private TextView  closeTextBtn;
    private TextView  InformationTitle;

    private String  ImageView , Name , Description , Servicetime , Location ,
            Servicetype ,Rating , TextTittle ,Tittle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

        closeTextBtn = (TextView) findViewById(R.id.close_aboutus_btn);
        closeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        //1. Find Object in activity_Informations_detail
        InformationImageView = (ImageView) findViewById(R.id.Information_ImageView);
        InformationName = (TextView) findViewById(R.id.Information_Name);
        InformationDescription = (TextView) findViewById(R.id.Information_Description);
        InformationServicetime = (TextView) findViewById(R.id.Information_Servicetime);
        InformationLocation = (TextView) findViewById(R.id.Information_Location);
        InformationService = (TextView) findViewById(R.id.Information_Detial_Service);
        InformationTitle = (TextView) findViewById(R.id.Information_Title);
        InformationDoctorService = (TextView) findViewById(R.id.Information_Service);

        InformationStar1 = (ImageView) findViewById(R.id.Infor_Star1);
        InformationStar2 = (ImageView) findViewById(R.id.Infor_Star2);
        InformationStar3 = (ImageView) findViewById(R.id.Infor_Star3);
        InformationStar4 = (ImageView) findViewById(R.id.Infor_Star4);
        InformationStar5 = (ImageView) findViewById(R.id.Infor_Star5);

        // 2. Receive Data form  Detail Activity
        ReceiveDataFormDetailActivity();

        // 3. Call ShowInformations for Display Data
        ShowInformations();

    }

    private void ReceiveDataFormDetailActivity() {

        // Receive Data form  Detail Activity
        Intent intent = getIntent();
        Tittle = intent.getStringExtra("title");
        ImageView = intent.getStringExtra("Url");
        Name = intent.getStringExtra("Name");
        Description = intent.getStringExtra("Description");
        Location = intent.getStringExtra("Location");
        Servicetime = intent.getStringExtra("Servicetime");
        Servicetype = intent.getStringExtra("Servicetype");
        Rating = intent.getStringExtra("Rating");
        TextTittle =(Tittle + " Informations");
    }


    private void ShowInformations() {

        // Display Data to activity_informations
        if (Tittle.equals("Doctors") ) {

            final String DoctorService = ("Certificate");
            InformationDoctorService.setText(DoctorService);
            Picasso.get().load(ImageView).into(InformationImageView);
            InformationTitle.setText(TextTittle);
            InformationName.setText(Name);
            InformationDescription.setText(Description);
            InformationServicetime.setText(Servicetime);
            InformationLocation.setText(Location);
            InformationService.setText(Servicetype);

        } else
            Picasso.get().load(ImageView).into(InformationImageView);
            InformationTitle.setText(TextTittle);
            InformationName.setText(Name);
            InformationDescription.setText(Description);
            InformationServicetime.setText(Servicetime);
            InformationLocation.setText(Location);
            InformationService.setText(Servicetype);


    }

}
