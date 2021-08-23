package dev.gustavodahora.outlook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvMain = findViewById(R.id.rv_main);
        List<MainItem> mainItems = new ArrayList<>();
        mainItems.add(new MainItem(1, R.drawable.person1, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person2, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person3, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person4, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person5, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person6, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person7, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person8, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person9, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));
        mainItems.add(new MainItem(1, R.drawable.person10, R.string.txt_person1, R.string.subject_person1, R.string.time_person1));

        rvMain.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter adapter = new MainAdapter(mainItems);

        rvMain.setAdapter(adapter);

    }

    public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
        private final List<MainItem> mainItems;

        public MainAdapter(List<MainItem> mainItems) {
            this.mainItems = mainItems;
        }

        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.item_mess, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainActivity.MainAdapter.MainViewHolder holder, int position) {
            Log.d("chama", " " + position);
            MainItem mainItemCurrent = mainItems.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return mainItems.size();
        }

        // Entenda como sendo a View da celula que está dentro do recycler
        private class MainViewHolder extends RecyclerView.ViewHolder {

            public MainViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void bind(MainItem item) {
                ImageView imgView = itemView.findViewById(R.id.image_person);
                TextView txtTitle = itemView.findViewById(R.id.title);
                TextView txtSubject = itemView.findViewById(R.id.subject);
                TextView txtTime = itemView.findViewById(R.id.txt_time);

                imgView.setImageResource(item.getImageId());
                txtTitle.setText(item.getTitleId());
                txtSubject.setText(item.getSubjectId());
                txtTime.setText(item.getTime());
            }
        }
    }
}