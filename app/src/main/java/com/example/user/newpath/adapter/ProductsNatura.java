package com.example.user.newpath.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.newpath.R;
import com.example.user.newpath.model.Products;

import java.util.ArrayList;

/**
 * Created by jussi on 10/4/17.
 */

public class ProductsNatura extends BaseAdapter {

    private ArrayList<Products> products;
    private LayoutInflater layoutInflater;
    private Context context;

    public  ProductsNatura(ArrayList<Products> products, Context context){
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Products getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder viewHolder;

        if (view == null){

            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.adpter_challenge_list, null);

            TextView produtcs_description = (TextView)view.findViewById(R.id.produtcs_description);
            TextView produtcs_score = (TextView)view.findViewById(R.id.produtcs_score);

            viewHolder = new ViewHolder(produtcs_description, produtcs_score);
            view.setTag(viewHolder);

        }else
            viewHolder = (ViewHolder)view.getTag();

        fillFields(i, viewHolder);

        return view;
    }


    public void fillFields(int position, ViewHolder viewHolder){

        Products productsNatura = products.get(position);

        viewHolder.produtcs_description.setText(productsNatura.getName());
        viewHolder.produtcs_score.setText(productsNatura.getScore());

    }

    public class ViewHolder {
        private TextView produtcs_description;
        private TextView produtcs_score;

        public ViewHolder(TextView produtcs_description,TextView produtcs_score) {
            this.produtcs_description  = produtcs_description;
            this.produtcs_score = produtcs_score;
        }
    }


}

