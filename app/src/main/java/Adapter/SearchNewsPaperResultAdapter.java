package adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xx.htmlproject.R;

import gsonbean.SearchPages;

/**
 * 搜索结果的适配器
 */
public class SearchNewsPaperResultAdapter extends RecyclerView.Adapter<SearchNewsPaperResultAdapter.MyViewHolder>{
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private SearchPages mSearchPages;

    public interface RecyItemOnclick
    {
        void onItemClick(View view, int postion);
    }
    private  RecyItemOnclick recyitemonclick;

    public void setRecyItemOnclick(RecyItemOnclick Listener){
        this.recyitemonclick=Listener;
    }

    public SearchNewsPaperResultAdapter(Context mContext , SearchPages mSearchPages) {
        this.mContext = mContext;
        this.mSearchPages=mSearchPages;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=mLayoutInflater.inflate(R.layout.search_newspaper_result_item_layout,parent,false);
        return new MyViewHolder(view,recyitemonclick);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.tv_name.setTypeface(Typeface.MONOSPACE);
        holder.tv_name.setText(mSearchPages.getData().get(position).getName());
        holder.tv_pages_num.setTextColor(Color.parseColor("#ff669900"));
        holder.tv_pages_num.setText(mSearchPages.getData().get(position).getPage());
        holder.tv_time.setHint(mSearchPages.getData().get(position).getDate());

    }


    @Override
    public int getItemCount() {
        return mSearchPages.getData().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_name;
        TextView tv_pages_num;
        TextView tv_time;
        RecyItemOnclick recyItemOnclick;
        MyViewHolder(View itemView, RecyItemOnclick recyItemOnclick) {
            super(itemView);
            tv_name= (TextView) itemView.findViewById(R.id.id_search_all_item_name);
            tv_pages_num= (TextView) itemView.findViewById(R.id.id_search_all_item_pagesnum);
            tv_time= (TextView) itemView.findViewById(R.id.id_search_all_item_time);
            this.recyItemOnclick=recyItemOnclick;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (recyItemOnclick!=null)
            {
                int positon=getLayoutPosition();
                recyItemOnclick.onItemClick(view,positon);
            }
        }
    }
}
