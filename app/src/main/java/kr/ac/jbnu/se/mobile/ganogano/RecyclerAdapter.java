package kr.ac.jbnu.se.mobile.ganogano;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private List<Note> list; //리스트 Note 클래스는 Note에 저장되어야 하는 거

    RecyclerAdapter(List<Note> list){//생성자
        this.list = list;
    }
    class ViewHolder extends RecyclerView.ViewHolder { //뷰 홀더에 아이템들 담기, 문제시 외부 클래스로 뺴기
        TextView textView1, textView2, textView3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
        }
    }
    @NonNull
    @Override //아이템 뷰를 위한 뷰 홀더 객체를 생성하여 리턴
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_format, parent, false); //아이템을 담을 뷰
        return new ViewHolder(view);
        /*
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.content_format, parent, false) ;
        RecyclerAdapter.ViewHolder vh = new RecyclerAdapter.ViewHolder(view) ;

        return vh ;*/
    }

    @Override //뷰에 아이템 매핑 아이템뷰 보여주기
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.textView1.setText(list.get(position).tv1); //위치에 따라 리스트 출력
        holder.textView2.setText(list.get(position).tv2);

        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), list.get(position).tv1, Toast.LENGTH_SHORT).show();
            }
        });

        holder.textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), list.get(position).tv2, Toast.LENGTH_SHORT).show();
            }
        });
        //text3는 필요할 때 넣기 이미지 뷰 필요한 경우 나중에
    }

    @Override //크기반환
    public int getItemCount() {
        return list.size();
    }
}


