class ChessBoard {
    int squares;
    String material;
    String color;
    double size;
    double price;

    ChessBoard(int squares, String material, String color, double size, double price) {
        this.squares = squares;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    ChessBoard(String material, String color) {
        this.material = material;
        this.color = color;
    }

    ChessBoard(int squares, double size) {
        this.squares = squares;
        this.size = size;
    }

    ChessBoard(String material, double price) {
        this.material = material;
        this.price = price;
    }

    ChessBoard(double size) {
        this.size = size;
    }

    ChessBoard() {}
}