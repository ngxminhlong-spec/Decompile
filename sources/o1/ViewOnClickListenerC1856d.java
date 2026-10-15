package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1856d implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14257o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ColorPicker f14258p;

    public /* synthetic */ ViewOnClickListenerC1856d(ColorPicker colorPicker, int i4) {
        this.f14257o = i4;
        this.f14258p = colorPicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14257o) {
            case 0:
                ColorPicker colorPicker = this.f14258p;
                colorPicker.f3594o.d(colorPicker.getResources().getColor(R.color.accent_1));
                return;
            case 1:
                ColorPicker colorPicker2 = this.f14258p;
                colorPicker2.f3594o.d(colorPicker2.getResources().getColor(R.color.accent_2));
                return;
            case 2:
                ColorPicker colorPicker3 = this.f14258p;
                colorPicker3.f3594o.d(colorPicker3.getResources().getColor(R.color.accent_3));
                return;
            case 3:
                ColorPicker colorPicker4 = this.f14258p;
                colorPicker4.f3594o.d(colorPicker4.getResources().getColor(R.color.accent_4));
                return;
            case 4:
                ColorPicker colorPicker5 = this.f14258p;
                colorPicker5.f3594o.d(colorPicker5.getResources().getColor(R.color.accent_5));
                return;
            default:
                ColorPicker colorPicker6 = this.f14258p;
                colorPicker6.f3594o.d(colorPicker6.getResources().getColor(R.color.accent_6));
                return;
        }
    }
}
