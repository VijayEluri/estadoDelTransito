package com.appspot.estadodeltransito.domain.subway;

import com.appspot.estadodeltransito.domain.IPublicTransportService;
import com.appspot.estadodeltransito.domain.TransportStation;


public class SubwayStation extends TransportStation implements IPublicTransportService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getShareMsg() {
		return toString();
	}
}
