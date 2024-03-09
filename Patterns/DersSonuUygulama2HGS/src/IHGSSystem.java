public interface IHGSSystem {
    HGSAccount createAccount();
    void doTransition(HGSAccount account);
}
