package C0;

import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0004d implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f292o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f293p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f294q;

    public /* synthetic */ ViewOnClickListenerC0004d(Object obj, KeyEvent.Callback callback, int i4) {
        this.f292o = i4;
        this.f293p = obj;
        this.f294q = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f292o;
        KeyEvent.Callback callback = this.f294q;
        Object obj = this.f293p;
        switch (i4) {
            case 0:
                D d = (D) obj;
                AbstractC1654b.E("LAUNCH_213");
                SharedPreferences.Editor edit = ((AbstractActivityC1671f) callback).getPreferences(0).edit();
                edit.putBoolean("rate_shown", true);
                edit.apply();
                AbstractC1654b.f12607f = Boolean.TRUE;
                d.d0();
                Toast.makeText(d.f187V0.getContext(), "Thank you for rating us!", 0).show();
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                int i5 = MainActivity.f3569O;
                mainActivity.getClass();
                ((View) callback).setVisibility(8);
                mainActivity.z();
                return;
            default:
                ((View) obj).setVisibility(8);
                SharedPreferences.Editor edit2 = ((AbstractActivityC1671f) callback).getPreferences(0).edit();
                edit2.putBoolean("electro", false);
                edit2.apply();
                AbstractC1806a.f14038l0 = Boolean.FALSE;
                return;
        }
    }
}
