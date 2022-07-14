package com.company;

import java.util.UUID;

public class ConcreteService extends AbstractService <UUID,RestModel,EntityModel> {
    @Override
    public RestModel readRest(EntityModel restModel) {
        System.out.println(restModel.toString());
        return new RestModel();
    }
}
