package com.surya.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.Exception.TouristNotFoundException;
import com.surya.entity.Tourist;
import com.surya.repo.ITouristRepo;

@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo touristrepo;

	@Override
	public String registerToursit(Tourist tourist) {
		int idVal = touristrepo.save(tourist).getTid();
		return "Tourist is registered having the id value::" + idVal;
	}

	@Override
	public List<Tourist> fetchAllTourists() {
		List<Tourist> list = touristrepo.findAll();
		list.sort((t1, t2) -> t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException {
		return touristrepo.findById(tid)
				                       .orElseThrow(() -> new  TouristNotFoundException(tid+"tourist not found"));
	}

	@Override
	public String updateTouristDetails(Tourist tourist) throws TouristNotFoundException {
	  Optional<Tourist> optional = touristrepo.findById(tourist.getTid());
	  if(optional.isPresent()) {
		  touristrepo.save(tourist);  // save (-) method either save obj or update obj operation
		  return tourist.getTid()+"object is updated";
	  }
	  else {
		   throw new TouristNotFoundException(tourist.getTid() +" Tourist Not found ");
	  }
	}

	@Override
	public String deleteTourist(Integer tid) throws TouristNotFoundException {
		 Optional<Tourist> optional = touristrepo.findById(tid);
		 if(optional.isPresent()) 
		 {
			  touristrepo.delete(optional.get());
			  return tid+" Tourist deleted";
		 }
		 else {
			  throw new TouristNotFoundException(tid+"::Tourist Not Found !!!");
		 }
	}

	@Override
	public String updateTouristBudgetById(Integer id, Float hikePercent) throws TouristNotFoundException {
          Optional<Tourist> opt = touristrepo.findById(id);
          if(opt.isPresent()) 
          {
        	  Tourist tourist = opt.get();
        	  tourist.setBudget(tourist.getBudget()+(tourist.getBudget()*(hikePercent / 100) ));
        	  touristrepo.save(tourist);
        	  return "Tourist Budget is Updated";
          }
          else
          {
        	  throw new TouristNotFoundException(id+"Tourist Not Found !!!!");
          }
	}

}
