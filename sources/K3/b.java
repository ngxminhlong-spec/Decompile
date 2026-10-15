package K3;

import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b extends B {
    public static void j0(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        S3.e.e(iArr, "<this>");
        S3.e.e(iArr2, "destination");
        System.arraycopy(iArr, i5, iArr2, i4, i6 - i5);
    }

    public static void k0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        S3.e.e(objArr, "<this>");
        S3.e.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    public static /* synthetic */ void l0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        k0(0, i4, i5, objArr, objArr2);
    }
}
