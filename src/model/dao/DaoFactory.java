package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJBDC(DB.getConnection());
    }
}
