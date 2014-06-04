package com.pedido.mcomanda;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PedidoFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View pedidoFragment = inflater.inflate(R.layout.fragment_pedido,
				container, false);
		
		return pedidoFragment;
	}

}
