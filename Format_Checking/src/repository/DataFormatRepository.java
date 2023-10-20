package repository;

import data_access.DataFormatDao;

public class DataFormatRepository implements IDataFormatRepository {

    @Override
    public void checkPhone() {
        DataFormatDao.Instance().checkPhone();
    }

    @Override
    public void checkDate() {
        DataFormatDao.Instance().checkDate();
    }

    @Override
    public void checkEmail() {
        DataFormatDao.Instance().checkEmail();
    }
}
