package C0;

import android.view.View;
import androidx.fragment.app.C0152a;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f236o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MainActivity f237p;

    public /* synthetic */ L(MainActivity mainActivity, int i4) {
        this.f236o = i4;
        this.f237p = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f236o) {
            case 0:
                if (((View) view.getParent()).getAlpha() == 0.0f) {
                    return;
                }
                androidx.fragment.app.s o4 = this.f237p.o();
                o4.getClass();
                C0152a c0152a = new C0152a(o4);
                c0152a.f(R.id.privacy_fragment_container, new w0(), null, 1);
                c0152a.c();
                c0152a.e(false);
                return;
            default:
                if (((View) view.getParent()).getAlpha() == 0.0f) {
                    return;
                }
                androidx.fragment.app.s o5 = this.f237p.o();
                o5.getClass();
                C0152a c0152a2 = new C0152a(o5);
                c0152a2.f(R.id.privacy_fragment_container, new P(), null, 1);
                c0152a2.c();
                c0152a2.e(false);
                return;
        }
    }
}
