class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int slots = 1;

        for (String node : nodes) {
            if (slots == 0) {
                return false;
            }

            slots--; // Consume one slot

            if (!node.equals("#")) {
                slots += 2; // Non-null node creates two child slots
            }
        }

        return slots == 0;
    }
}