package o1;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1832H extends Dialog {

    /* renamed from: o, reason: collision with root package name */
    public boolean f14210o;

    public DialogC1832H(AbstractActivityC1671f abstractActivityC1671f) {
        super(abstractActivityC1671f);
        setContentView(R.layout.mic_perm_dialog_layout);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        findViewById(R.id.permissions_dlg_allow).setOnClickListener(new ViewOnClickListenerC1831G(this, 0));
        findViewById(R.id.permissions_dlg_close).setOnClickListener(new ViewOnClickListenerC1831G(this, 1));
    }
}
