package com.example.javalearningcomponentspchandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<PCComponent> pcComponents = new ArrayList<PCComponent>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData(); //Инициализация списка

        RecyclerView recyclerView = findViewById(R.id.list_components); // создадим объект RecyclerView и привяжем к нему соответствующий id

        // создадим адаптер и загрузим в него контейнер с данными
        PCComponentAdapter adapter = new PCComponentAdapter(this, pcComponents);

        recyclerView.setAdapter(adapter); // на recyclerView подадим адаптер
    }

    private void setInitialData(){
        pcComponents.add(new PCComponent("Процессоры", getString(R.string.proc_description), R.drawable.proc));
        pcComponents.add(new PCComponent("Материнские платы", getString(R.string.mb_description), R.drawable.mb));
        pcComponents.add(new PCComponent("Видеокарты", getString(R.string.vc_description), R.drawable.vc));
        pcComponents.add(new PCComponent("Оперативная память", getString(R.string.mem_description), R.drawable.mem));
        pcComponents.add(new PCComponent("Корпуса", getString(R.string.case_description), R.drawable.resource_case));
        pcComponents.add(new PCComponent("Блоки питания", getString(R.string.bp_description), R.drawable.bp));
        pcComponents.add(new PCComponent("Охлаждение компьютера", getString(R.string.cooler_description), R.drawable.cooler));
        pcComponents.add(new PCComponent("Твердотельные накопители", getString(R.string.ssd_description), R.drawable.ssd));
        pcComponents.add(new PCComponent("Жесткие диски", getString(R.string.hdd_description), R.drawable.hdd));
        pcComponents.add(new PCComponent("Мониторы", getString(R.string.monitor_description), R.drawable.monitor));

    }
}