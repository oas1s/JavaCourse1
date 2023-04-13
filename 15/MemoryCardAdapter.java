public class MemoryCardAdapter implements USB {

    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }


    @Override
    public void connectViaUsb() {
        memoryCard.insert();
        memoryCard.pictures();
    }
}
