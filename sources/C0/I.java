package C0;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class I implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f231o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f232p;

    public /* synthetic */ I(int i4, Object obj) {
        this.f231o = i4;
        this.f232p = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f231o;
        Object obj = this.f232p;
        switch (i4) {
            case 0:
                int i5 = MainActivity.f3569O;
                ((View) obj).setVisibility(8);
                return;
            case 1:
                int i6 = MainActivity.f3569O;
                ((View) obj).setVisibility(8);
                return;
            default:
                ((MainActivity) ((v0) obj).f432n0).z();
                return;
        }
    }
}
