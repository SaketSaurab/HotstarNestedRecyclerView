package com.example.hotstarsportsnestedlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<CategoryItem> categoryItemList1 = new ArrayList<>();
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));
        categoryItemList1.add(new CategoryItem(1, R.drawable.iplcska));


        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList2.add(new CategoryItem(1, R.drawable.iplcske));


        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList3.add(new CategoryItem(1, R.drawable.iplcske));


        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList4.add(new CategoryItem(1, R.drawable.iplcske));


        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList5.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList6 = new ArrayList<>();
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList6.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList7 = new ArrayList<>();
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList7.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList8 = new ArrayList<>();
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList8.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList9 = new ArrayList<>();
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList9.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList10 = new ArrayList<>();
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList10.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList11 = new ArrayList<>();
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList11.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList12 = new ArrayList<>();
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList12.add(new CategoryItem(1, R.drawable.iplcske));

        List<CategoryItem> categoryItemList13 = new ArrayList<>();
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));
        categoryItemList13.add(new CategoryItem(1, R.drawable.iplcske));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Popular Sports", categoryItemList1));
        allCategoryList.add(new AllCategory("Best of VIVO IPL 2021 Action", categoryItemList2));
        allCategoryList.add(new AllCategory("VIVO IPL:Match Highlights", categoryItemList3));
        allCategoryList.add(new AllCategory("Match Previews:Key Insights", categoryItemList4));
        allCategoryList.add(new AllCategory("Fall of wickets by PhonePe", categoryItemList5));
        allCategoryList.add(new AllCategory("Super 6s by Coin DCX", categoryItemList6));
        allCategoryList.add(new AllCategory("Super 4s by Masai School", categoryItemList7));
        allCategoryList.add(new AllCategory("Sahi Hai Milestones", categoryItemList8));
        allCategoryList.add(new AllCategory("Highlights by ACKO Insurence", categoryItemList9));
        allCategoryList.add(new AllCategory("VIVO IPL Replays", categoryItemList10));
        allCategoryList.add(new AllCategory("Top Replays", categoryItemList11));
        allCategoryList.add(new AllCategory("Popular in Cricket", categoryItemList12));
        allCategoryList.add(new AllCategory("Popular in Kabaddi", categoryItemList13));

        setMainCategoryRecycler(allCategoryList);

    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }


}