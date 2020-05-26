package kr.ac.jbnu.se.mobile.ganogano;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NoteFirstFragment extends Fragment {
    RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    List<Note> list = new ArrayList<>(); //혹시 모를 list

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.note_fragment_first, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.rv);//리사이클뷰
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(getActivity(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

    //새로운 뷰로 넘어가기 ( 다음 프레그먼트를 의미) 여기서는 실습노트 -> 간호술기리스트로 넘어가기
/*    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NoteFirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }*/
}
