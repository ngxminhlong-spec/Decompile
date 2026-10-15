package androidx.profileinstaller;

import V2.e;
import Z.h;
import Z.j;
import android.content.Context;
import android.os.Build;
import i0.InterfaceC1714b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1714b {
    @Override // i0.InterfaceC1714b
    public final void a() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // i0.InterfaceC1714b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e(16);
        }
        j.a(new h(this, context.getApplicationContext()));
        return new e(16);
    }
}
