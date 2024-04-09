package model.dao;

import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJBDC();
    }
}
