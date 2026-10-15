package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NumberPicker;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1828D implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14204o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f14205p;

    public /* synthetic */ ViewOnClickListenerC1828D(NumberPicker numberPicker, int i4) {
        this.f14204o = i4;
        this.f14205p = numberPicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14204o) {
            case 0:
                NumberPicker numberPicker = this.f14205p;
                if (numberPicker.f3666p == 0) {
                    numberPicker.f3669s.setAlpha(1.0f);
                }
                if (numberPicker.f3666p == numberPicker.f3665o.size() - 2) {
                    numberPicker.f3668r.setAlpha(0.5f);
                }
                if (numberPicker.f3666p == numberPicker.f3665o.size() - 1) {
                    return;
                }
                int i4 = numberPicker.f3666p + 1;
                numberPicker.f3666p = i4;
                numberPicker.f3667q.setText((CharSequence) numberPicker.f3665o.get(i4));
                return;
            default:
                NumberPicker numberPicker2 = this.f14205p;
                if (numberPicker2.f3666p == numberPicker2.f3665o.size() - 1) {
                    numberPicker2.f3668r.setAlpha(1.0f);
                }
                if (numberPicker2.f3666p == 1) {
                    numberPicker2.f3669s.setAlpha(0.5f);
                }
                int i5 = numberPicker2.f3666p;
                if (i5 == 0) {
                    return;
                }
                int i6 = i5 - 1;
                numberPicker2.f3666p = i6;
                numberPicker2.f3667q.setText((CharSequence) numberPicker2.f3665o.get(i6));
                return;
        }
    }
}
