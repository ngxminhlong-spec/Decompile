package k0;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // com.google.android.gms.internal.play_billing.B
    public final void Q(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // k0.x, com.google.android.gms.internal.play_billing.B
    public final void R(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // k0.x
    public final void j0(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // k0.x
    public final void k0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k0.x
    public final void l0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final float y(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
