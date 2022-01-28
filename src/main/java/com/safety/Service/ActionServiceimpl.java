package com.safety.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.safety.DAO.ActionDAO;
import com.safety.Model.Action;


@Service
public class ActionServiceimpl implements ActionService{

	
	@Autowired
	ActionDAO dao;

	@Override
	public Action addAction(Action actions) {
		
		Action aa= dao.save(actions);
		return aa;
	}
	
	

}
