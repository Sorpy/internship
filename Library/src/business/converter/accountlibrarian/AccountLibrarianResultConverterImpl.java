package business.converter.accountlibrarian;

import data.entity.AccountLibrarian;

public class AccountLibrarianResultConverterImpl implements AccountLibrarianResultConverter {
    @Override
    public AccountLibrarianResult convert(AccountLibrarian param) {

            AccountLibrarianResult accountLibrarianResult = new AccountLibrarianResult();

            accountLibrarianResult.setFirstName(param.getFirstName());
            accountLibrarianResult.setSecondName(param.getSecondName());
            accountLibrarianResult.setLastName(param.getLastName());
            accountLibrarianResult.setAddress(param.getAddress());
            accountLibrarianResult.setCity(param.getCity());
            accountLibrarianResult.setCountry(param.getCountry());
            accountLibrarianResult.setEmail(param.getEmail());
            accountLibrarianResult.setPhone(param.getPhone());
            accountLibrarianResult.setID(param.getID());
            accountLibrarianResult.setName(param.getName());
            accountLibrarianResult.setCode(param.getCode());
            accountLibrarianResult.setDescription(param.getDescription());
            accountLibrarianResult.setAccountLibrarianStatusId(param.getAccountLibrarianStatus().getID());
            accountLibrarianResult.setAccountLibrarianStatusName(param.getAccountLibrarianStatus().getName());
            accountLibrarianResult.setUserId(param.getUser().getID());
            accountLibrarianResult.setUsername(param.getUser().getUsername());
            return accountLibrarianResult;
    }

}
