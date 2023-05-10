package com.example.javalearningcomponentspchandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PCComponentAdapter extends RecyclerView.Adapter<PCComponentAdapter.ViewHolder>{

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<PCComponent> pcComponents; // поле коллекции контейнера для хранения данных (объектов класса pcComponents)

    // конструктор адаптера
    public PCComponentAdapter(Context context, List<PCComponent> pcComponents) {
        this.inflater = LayoutInflater.from(context);
        this.pcComponents = pcComponents;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту PCComponent
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент

        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту PCComponent по определенной позиции
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PCComponent component = pcComponents.get(position);
        holder.componentResourceView.setImageResource(component.getComponentResource());
        holder.nameView.setText(component.getName());
        holder.componentDescriptionView.setText(component.getComponentDescription());

    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return pcComponents.size();
    }


    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // неизменяемые поля представления
        final ImageView componentResourceView;
        final TextView nameView, componentDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        public ViewHolder(View itemView) {
            super(itemView);

            componentResourceView = itemView.findViewById(R.id.componentResource);
            nameView = itemView.findViewById(R.id.name);
            componentDescriptionView = itemView.findViewById(R.id.componentDescription);

        }
    }

}
