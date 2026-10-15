package b0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3325a;

    /* renamed from: b, reason: collision with root package name */
    public int f3326b;
    public int c;
    public int d;

    public C0197j() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.f3325a = new int[highestOneBit];
    }

    public void a(int i4) {
        int[] iArr = this.f3325a;
        int i5 = this.c;
        iArr[i5] = i4;
        int i6 = this.d & (i5 + 1);
        this.c = i6;
        int i7 = this.f3326b;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            K3.b.j0(0, i7, length, iArr, iArr2);
            K3.b.j0(i8, 0, this.f3326b, this.f3325a, iArr2);
            this.f3325a = iArr2;
            this.f3326b = 0;
            this.c = length;
            this.d = i9 - 1;
        }
    }

    public void b(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.d;
        int i7 = i6 * 2;
        int[] iArr = this.f3325a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3325a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f3325a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3325a;
        iArr4[i7] = i4;
        iArr4[i7 + 1] = i5;
        this.d++;
    }

    public void c(RecyclerView recyclerView, boolean z4) {
        this.d = 0;
        int[] iArr = this.f3325a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0178L abstractC0178L = recyclerView.f3025A;
        if (recyclerView.f3091z == null || abstractC0178L == null || !abstractC0178L.f3190i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f3076r.k()) {
                abstractC0178L.i(recyclerView.f3091z.a(), this);
            }
        } else if (!recyclerView.L()) {
            abstractC0178L.h(this.f3326b, this.c, recyclerView.f3081t0, this);
        }
        int i4 = this.d;
        if (i4 > abstractC0178L.f3191j) {
            abstractC0178L.f3191j = i4;
            abstractC0178L.f3192k = z4;
            recyclerView.f3072p.k();
        }
    }
}
