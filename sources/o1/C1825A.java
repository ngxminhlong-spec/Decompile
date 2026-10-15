package o1;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825A implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1827C f14202b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Switch d;

    public /* synthetic */ C1825A(InterfaceC1827C interfaceC1827C, ViewGroup viewGroup, Switch r32, int i4) {
        this.f14201a = i4;
        this.f14202b = interfaceC1827C;
        this.c = viewGroup;
        this.d = r32;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        switch (this.f14201a) {
            case 0:
                boolean f4 = this.f14202b.f(z4);
                ((TextView) this.c.findViewById(R.id.snapping_text)).setText(z4 ? R.string.on : R.string.off);
                if (!z4 || f4) {
                    return;
                }
                this.d.setChecked(false);
                return;
            default:
                boolean o4 = this.f14202b.o(z4);
                ((TextView) this.c.findViewById(R.id.vibration_text)).setText(z4 ? R.string.on : R.string.off);
                if (!z4 || o4) {
                    return;
                }
                this.d.setChecked(false);
                return;
        }
    }
}
