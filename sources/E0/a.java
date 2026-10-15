package E0;

import I0.d;
import N1.n;
import Q1.J;
import Q1.N;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.ads.C0757iz;
import com.google.android.gms.internal.ads.C1134rq;
import com.google.android.gms.internal.ads.DE;
import com.google.android.gms.internal.ads.KE;
import com.google.android.gms.internal.ads.NB;
import com.google.android.gms.internal.ads.Px;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;
import m2.c;
import org.json.JSONObject;
import s1.InterfaceC1974d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements Px {

    /* renamed from: o, reason: collision with root package name */
    public int f707o;

    /* renamed from: p, reason: collision with root package name */
    public int f708p;

    /* renamed from: q, reason: collision with root package name */
    public Object f709q;

    /* renamed from: r, reason: collision with root package name */
    public Object f710r;

    /* renamed from: s, reason: collision with root package name */
    public Object f711s;

    @Override // com.google.android.gms.internal.ads.Px
    public Map a() {
        return ((Px) this.f709q).a();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public void b(NB nb) {
        nb.getClass();
        ((Px) this.f709q).b(nb);
    }

    public void c(d dVar) {
        e1.d dVar2 = (e1.d) this.f711s;
        ArrayList arrayList = (ArrayList) this.f709q;
        if (arrayList.add(dVar)) {
            if (!dVar.a(dVar2)) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            ((ArrayList) this.f710r).clear();
            this.f707o++;
            BoardView boardView = (BoardView) dVar2.f12683R.f14883r;
            InterfaceC1974d interfaceC1974d = boardView.f3798D;
            if (interfaceC1974d != null) {
                interfaceC1974d.m();
            }
            boardView.invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public Uri e() {
        return ((Px) this.f709q).e();
    }

    public JSONObject f() {
        String str;
        String encodeToString;
        int i4 = this.f708p;
        int i5 = this.f707o;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f710r;
        Context context = (Context) this.f709q;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            J j4 = N.f1668k;
            Context context2 = c.a(context).f14053a;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        N n4 = n.f1204A.c;
        Drawable drawable = null;
        try {
            str = N.C(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (((String) this.f711s).isEmpty()) {
            try {
                m2.b a4 = c.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a4.f14053a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i5, i4);
                Bitmap createBitmap = Bitmap.createBitmap(i5, i4, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f711s = encodeToString;
        }
        if (!((String) this.f711s).isEmpty()) {
            jSONObject.put("icon", (String) this.f711s);
            jSONObject.put("iconWidthPx", i5);
            jSONObject.put("iconHeightPx", i4);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public void i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public long o(C0757iz c0757iz) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public int r(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = (byte[]) this.f711s;
        Px px = (Px) this.f709q;
        int i6 = this.f708p;
        if (i6 == 0) {
            int i7 = 0;
            if (px.r(bArr2, 0, 1) != -1) {
                int i8 = (bArr2[0] & 255) << 4;
                if (i8 != 0) {
                    byte[] bArr3 = new byte[i8];
                    int i9 = i8;
                    while (i9 > 0) {
                        int r4 = px.r(bArr3, i7, i9);
                        if (r4 != -1) {
                            i7 += r4;
                            i9 -= r4;
                        }
                    }
                    while (i8 > 0) {
                        int i10 = i8 - 1;
                        if (bArr3[i10] != 0) {
                            break;
                        }
                        i8 = i10;
                    }
                    if (i8 > 0) {
                        DE de = (DE) this.f710r;
                        C1134rq c1134rq = new C1134rq(i8, bArr3);
                        long max = !de.f4608l ? de.f4605i : Math.max(de.f4609m.q(true), de.f4605i);
                        int g4 = c1134rq.g();
                        KE ke = de.f4607k;
                        ke.getClass();
                        ke.c(g4, c1134rq);
                        ke.d(max, 1, g4, 0, null);
                        de.f4608l = true;
                    }
                }
                i6 = this.f707o;
                this.f708p = i6;
            }
            return -1;
        }
        int r5 = px.r(bArr, i4, Math.min(i6, i5));
        if (r5 != -1) {
            this.f708p -= r5;
        }
        return r5;
    }
}
