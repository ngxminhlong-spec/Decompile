package M2;

import android.content.Context;
import android.util.TypedValue;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1149b;
    public final int c;
    public final float d;

    public a(Context context) {
        TypedValue M4 = B.M(context, R.attr.elevationOverlayEnabled);
        this.f1148a = (M4 == null || M4.type != 18 || M4.data == 0) ? false : true;
        TypedValue M5 = B.M(context, R.attr.elevationOverlayColor);
        this.f1149b = M5 != null ? M5.data : 0;
        TypedValue M6 = B.M(context, R.attr.colorSurface);
        this.c = M6 != null ? M6.data : 0;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
