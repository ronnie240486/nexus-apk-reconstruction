package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f10091x;

    /* JADX INFO: renamed from: y */
    public int f10092y;

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f10091x;
        return i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f10092y) && i2 < i3 + this.height;
    }

    public int getCenterX() {
        return (this.f10091x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f10092y + this.height) / 2;
    }

    public void grow(int i, int i2) {
        this.f10091x -= i;
        this.f10092y -= i2;
        this.width = (i * 2) + this.width;
        this.height = (i2 * 2) + this.height;
    }

    public boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        int i3 = this.f10091x;
        int i4 = rectangle.f10091x;
        return i3 >= i4 && i3 < i4 + rectangle.width && (i = this.f10092y) >= (i2 = rectangle.f10092y) && i < i2 + rectangle.height;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f10091x = i;
        this.f10092y = i2;
        this.width = i3;
        this.height = i4;
    }
}
