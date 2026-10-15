package N1;

import Q1.N;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0291Jb;
import com.google.android.gms.internal.ads.C0310Na;
import com.google.android.gms.internal.ads.InterfaceC0301Lb;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1152a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1153b;
    public final InterfaceC0301Lb c;
    public final C0310Na d = new C0310Na(Collections.EMPTY_LIST, false);

    public a(Context context, InterfaceC0301Lb interfaceC0301Lb) {
        this.f1152a = context;
        this.c = interfaceC0301Lb;
    }

    public final void a(String str) {
        List<String> list;
        C0310Na c0310Na = this.d;
        InterfaceC0301Lb interfaceC0301Lb = this.c;
        if ((interfaceC0301Lb == null || !((C0291Jb) interfaceC0301Lb).f5861g.f6029t) && !c0310Na.f6316o) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC0301Lb != null) {
            ((C0291Jb) interfaceC0301Lb).a(str, null, 3);
            return;
        }
        if (!c0310Na.f6316o || (list = c0310Na.f6317p) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                N n4 = n.f1204A.c;
                N.i(this.f1152a, "", replace);
            }
        }
    }

    public final boolean b() {
        InterfaceC0301Lb interfaceC0301Lb = this.c;
        return ((interfaceC0301Lb == null || !((C0291Jb) interfaceC0301Lb).f5861g.f6029t) && !this.d.f6316o) || this.f1153b;
    }
}
