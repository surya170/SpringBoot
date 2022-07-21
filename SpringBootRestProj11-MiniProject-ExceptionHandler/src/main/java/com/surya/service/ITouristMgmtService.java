package com.surya.service;

import java.util.List;

import com.surya.Exception.TouristNotFoundException;
import com.surya.entity.Tourist;

public interface ITouristMgmtService {
    public String registerToursit(Tourist tourist);
    public List<Tourist> fetchAllTourists();
    public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException;
    public String updateTouristDetails(Tourist tourist) throws TouristNotFoundException;
    public String deleteTourist(Integer tid) throws TouristNotFoundException;
    public String updateTouristBudgetById(Integer id,Float hikePercent) throws TouristNotFoundException;
    
}
