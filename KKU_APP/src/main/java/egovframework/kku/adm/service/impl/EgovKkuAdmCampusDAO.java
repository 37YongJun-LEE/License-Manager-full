package egovframework.kku.adm.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.kku.adm.service.EgovKkuAdmCampusInfoVO;
import egovframework.kku.adm.service.EgovKkuAdmFacilityReportVO;

import egovframework.kku.adm.service.EgovKkuAdmRestaurantMenuVO;
import egovframework.kku.adm.service.EgovKkuAdmRestaurantVO;
import egovframework.kku.adm.service.EgovKkuAdmStudentInfoVO;
import egovframework.kku.usr.service.EgovKkuAppSchoolInfoCrawlerVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository("adminCampusDAO")
public class EgovKkuAdmCampusDAO extends EgovComAbstractDAO{

	public List<?> getReportList(EgovKkuAdmFacilityReportVO rVO) throws Exception{
		return list("adminCampusDAO.getReportList",rVO);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectCampusList(EgovKkuAdmCampusInfoVO infoVO) {
		
		return (List<EgovMap>) list("adminCampusDAO.selectCampusList", infoVO);
	}

	public List<?> selectCampusInfoUpdateList() {
		
		return list("adminCampusDAO.selectCampusInfoUpdateList");
	}
	
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectStudentList(EgovKkuAppSchoolInfoCrawlerVO infoVO) {
		
		return (List<EgovMap>) list("adminCampusDAO.selectStudentList", infoVO);
	}

	public List<?> selectStudentInfoUpdateList() {
		
		return list("adminCampusDAO.selectStudentInfoUpdateList");
	}

	public EgovKkuAdmCampusInfoVO selectCampusInfoDetail(EgovKkuAdmCampusInfoVO infoVO) {
		
		return (EgovKkuAdmCampusInfoVO) select("adminCampusDAO.selectCampusInfoDetail", infoVO);
	}

	public int updateCampusInfo(EgovKkuAdmCampusInfoVO infoVO) {
		
		return (int)update("adminCampusDAO.updateCampusInfo",infoVO);
	}

	public int selectCampusInfoListCnt(EgovKkuAdmCampusInfoVO infoVO) {
		
		return (int)select("adminCampusDAO.selectCampusInfoListCnt", infoVO);
	}

	public int selectStudentInfoListCnt(EgovKkuAppSchoolInfoCrawlerVO infoVO) {
		
		return (int)select("adminCampusDAO.selectStudentInfoListCnt", infoVO);
	}

	public EgovKkuAdmStudentInfoVO selectStudentInfoDetail(EgovKkuAdmStudentInfoVO infoVO) {
		
		return (EgovKkuAdmStudentInfoVO) select("adminCampusDAO.selectStudentInfoDetail", infoVO);
	}

	public int updateStudentInfo(EgovKkuAdmStudentInfoVO infoVO) {
		
		return (int)update("adminCampusDAO.updateStudentInfo", infoVO);
	}


	public EgovMap selectFacilityReportDetailByIdx(EgovKkuAdmFacilityReportVO vo) {
		return (EgovMap) select("adminCampusDAO.selectFacilityReportDetailByIdx", vo);
	}

	public List<?> selectRestaurantList(EgovKkuAdmRestaurantVO restVO) {
		
		return list("adminCampusDAO.selectRestaurantList", restVO);
	}

	public int selectRestaurantListCnt(EgovKkuAdmRestaurantVO restVO) {

		return (Integer)select("adminCampusDAO.selectRestaurantListCnt", restVO);
	}

	public void updateFixReportByIdx(EgovKkuAdmFacilityReportVO vo) {
		update("adminCampusDAO.updateFixReportByIdx",vo);
		
	}
	
	public int getReportListCnt(EgovKkuAdmFacilityReportVO vo) {
		return (int)select("adminCampusDAO.getReportListCnt", vo);
	}
	
	public EgovMap selectRestaurantListDetail(EgovKkuAdmRestaurantVO restVO) {

	

		return (EgovMap) select("adminCampusDAO.selectRestaurantDetail", restVO);
	}


	public void insertRestaurant(EgovKkuAdmRestaurantVO restVO) {
		insert("adminCampusDAO.insertRestaurant", restVO);
	}

	public void updateRestaurant(EgovKkuAdmRestaurantVO restVO) {
		update("adminCampusDAO.updateRestaurant", restVO);
	}

	public void deleteRestaurant(int restIdx) {

		delete("adminCampusDAO.deleteRestaurant", restIdx);
	}

	public List<?> selectRestMenu(int restIdx) {
	
		return list("adminCampusDAO.selectRestMenu", restIdx);
	}

	public void deleteRestaurantMenu(String menuIdx) {
		
		delete("adminCampusDAO.deleteRestaurantMenu", menuIdx);
	}

	public void insertMainMenu(EgovKkuAdmRestaurantMenuVO menuVO) {
		
		insert("adminCampusDAO.insertRestaurantMainMenu", menuVO);	
	}

	public void updateMainMenu(EgovKkuAdmRestaurantMenuVO menuVO) {

		update("adminCampusDAO.updateRestaurantMainMenu", menuVO);
	}

	
	public void insertSubMenu(EgovKkuAdmRestaurantMenuVO menuVO) {
		insert("adminCampusDAO.insertRestaurantSubMenu", menuVO);	
	}

	public void updateSubMenu(EgovKkuAdmRestaurantMenuVO menuVO) {
		update("adminCampusDAO.updateRestaurantSubMenu", menuVO);
	}

	public List<?> selectRestSubMenuList(int restIdx) {
		return list("adminCampusDAO.selectRestSubMenuList", restIdx);
	}
}
