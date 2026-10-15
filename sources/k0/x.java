package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class x extends com.google.android.gms.internal.play_billing.B {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f13565h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f13566i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f13567j = true;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f13568k = true;

    @Override // com.google.android.gms.internal.play_billing.B
    public void R(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.R(view, i4);
        } else if (f13568k) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f13568k = false;
            }
        }
    }

    public void j0(View view, int i4, int i5, int i6, int i7) {
        if (f13567j) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f13567j = false;
            }
        }
    }

    public void k0(View view, Matrix matrix) {
        if (f13565h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f13565h = false;
            }
        }
    }

    public void l0(View view, Matrix matrix) {
        if (f13566i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f13566i = false;
            }
        }
    }
}
