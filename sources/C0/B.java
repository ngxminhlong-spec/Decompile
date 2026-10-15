package C0;

import android.text.TextUtils;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B extends O.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f164b;

    public /* synthetic */ B(H h4, int i4) {
        this.f163a = i4;
        this.f164b = h4;
    }

    @Override // O.f, O.c
    public void a(float f4) {
        switch (this.f163a) {
            case 1:
                ((v0) this.f164b).f425g0.setRotation(f4 * 90.0f);
                return;
            default:
                return;
        }
    }

    @Override // O.f, O.c
    public void b() {
        switch (this.f163a) {
            case 0:
                D d = (D) this.f164b;
                d.f209m0.setDrawerLockMode(1);
                String obj = ((EditText) d.f209m0.findViewById(R.id.project_name)).getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    d.f198g0.f13260b = obj;
                    d.f217q0.setText(obj);
                    d.f223v0.clearFocus();
                }
                ((EditText) d.f209m0.findViewById(R.id.project_name)).setText(d.f198g0.f13260b);
                return;
            case 1:
            default:
                return;
            case 2:
                D0.g gVar = (D0.g) this.f164b;
                gVar.f569k0.setDrawerLockMode(1);
                String obj2 = ((EditText) gVar.f569k0.findViewById(R.id.project_name)).getText().toString();
                if (!TextUtils.isEmpty(obj2)) {
                    gVar.f565g0.f13260b = obj2;
                    gVar.f572n0.setText(obj2);
                }
                ((EditText) gVar.f569k0.findViewById(R.id.project_name)).setText(gVar.f565g0.f13260b);
                return;
        }
    }
}
