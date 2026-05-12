class ApolloHospital implements Hospital {

    @Override
    public void admitPatient() {

        System.out.println("Patient is admitted");
    }

    @Override
    public void dischargePatient() {
        System.out.println("patient discharged from appolo hospital");
    }
}
