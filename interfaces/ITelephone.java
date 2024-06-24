public interface Telephone {
    public void dialNumber(int number);
    public void endCall();
    public void sendSMS(int number, String message);
    public List<String> receiveSMS();
}