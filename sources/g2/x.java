package g2;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.LoadingScreen;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import com.google.android.gms.internal.ads.C0590f1;
import com.google.android.gms.internal.ads.Qw;
import h.C1691e;
import h2.y;
import java.io.ByteArrayOutputStream;
import l.C1773j;
import l.V;
import o1.DialogC1878o;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C1995b;
import t2.C1997d;
import t2.C1999f;
import t2.C2000g;
import t2.C2003j;
import t2.K;
import x2.C2066c0;
import x2.C2073g;
import x2.C2083l;
import x2.C2103v0;
import x2.L0;
import x2.O;
import x2.O0;
import x2.P0;
import x2.Q;
import x2.Q0;
import x2.R0;
import x2.T;
import x2.T0;
import x2.U;
import x2.X;
import x2.X0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13039o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f13040p;

    public /* synthetic */ x(int i4, Object obj) {
        this.f13039o = i4;
        this.f13040p = obj;
    }

    public x(B0.t tVar, boolean z4) {
        this.f13039o = 16;
        this.f13040p = tVar;
    }

    public x(k kVar, B0.r rVar) {
        this.f13039o = 0;
        this.f13040p = rVar;
    }

    public x(X0 x02, m2.b bVar) {
        this.f13039o = 18;
        this.f13040p = x02;
    }

    /* JADX WARN: Type inference failed for: r1v84, types: [x2.T0, x2.b] */
    @Override // java.lang.Runnable
    public final void run() {
        C1773j c1773j;
        int currentPosition;
        String concat;
        switch (this.f13039o) {
            case 0:
                throw null;
            case 1:
                C1691e c1691e = (C1691e) this.f13040p;
                c1691e.a(true);
                c1691e.invalidateSelf();
                return;
            case 2:
                V v4 = (V) this.f13040p;
                v4.f13677A = null;
                v4.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f13040p).f2624o;
                if (actionMenuView == null || (c1773j = actionMenuView.f2536H) == null) {
                    return;
                }
                c1773j.n();
                return;
            case 4:
                Worker worker = (Worker) this.f13040p;
                try {
                    worker.f3126t.i(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f3126t.j(th);
                    return;
                }
            case 5:
                DialogC1878o dialogC1878o = (DialogC1878o) this.f13040p;
                if (dialogC1878o.isShowing()) {
                    if (dialogC1878o.f14291q.getDuration() >= 1 && (currentPosition = dialogC1878o.f14291q.getCurrentPosition()) >= 1) {
                        dialogC1878o.f14292r.setPadding((int) (((float) (1.0d - Math.pow(1.0f - (currentPosition / r1), 3.0d))) * dialogC1878o.f14291q.getWidth()), 0, 0, 0);
                    }
                    dialogC1878o.f14291q.postDelayed(this, 32L);
                    return;
                }
                return;
            case 6:
                InsertProjectLayout insertProjectLayout = (InsertProjectLayout) this.f13040p;
                if (insertProjectLayout.f3641v == null) {
                    return;
                }
                insertProjectLayout.f3634o.setVisibility(0);
                return;
            case 7:
                x xVar = (x) this.f13040p;
                ((LoadingScreen) xVar.f13040p).setVisibility(8);
                View.OnClickListener onClickListener = ((LoadingScreen) xVar.f13040p).f3652F;
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                    return;
                }
                return;
            case 8:
                LoadingScreen loadingScreen = (LoadingScreen) this.f13040p;
                int i4 = loadingScreen.f3647A;
                int i5 = loadingScreen.f3664z;
                if (i4 < i5) {
                    int i6 = i4 + 1;
                    loadingScreen.f3647A = i6;
                    if (i6 == i5) {
                        loadingScreen.f3656q.setVisibility(8);
                        loadingScreen.f3655p.setVisibility(0);
                    }
                } else {
                    int i7 = loadingScreen.f3649C;
                    int i8 = loadingScreen.f3648B;
                    if (i7 < i8) {
                        int i9 = i7 + 1;
                        loadingScreen.f3649C = i9;
                        if (i9 == i8) {
                            loadingScreen.f3658s.setVisibility(8);
                            loadingScreen.f3657r.setVisibility(0);
                        }
                    } else {
                        int i10 = loadingScreen.f3651E;
                        int i11 = loadingScreen.f3650D;
                        if (i10 < i11) {
                            int i12 = i10 + 1;
                            loadingScreen.f3651E = i12;
                            if (i12 == i11) {
                                loadingScreen.f3660u.setVisibility(8);
                                loadingScreen.f3659t.setVisibility(0);
                            }
                        } else {
                            loadingScreen.f3661v = true;
                        }
                    }
                }
                if (!loadingScreen.f3661v) {
                    loadingScreen.postDelayed(this, 256L);
                    return;
                } else {
                    loadingScreen.animate().alpha(0.0f).setDuration(150L).setStartDelay(1300L);
                    loadingScreen.postDelayed(new x(7, this), 1500L);
                    return;
                }
            case 9:
                ((TimeDiagramLayout) this.f13040p).f3733w.scrollTo(0, 0);
                return;
            case 10:
                UploaderLayout uploaderLayout = (UploaderLayout) this.f13040p;
                if (uploaderLayout.f3794t == null) {
                    return;
                }
                uploaderLayout.f3789o.setVisibility(0);
                return;
            case 11:
                Context context = (Context) ((q2.e) this.f13040p).f14709p;
                long j4 = q2.e.F(context).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || System.currentTimeMillis() <= j5) {
                    return;
                }
                if (!q2.e.F(context).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 12:
                C2000g c2000g = (C2000g) this.f13040p;
                K k3 = new K("Web view timed out.", 4);
                C1999f c1999f = (C1999f) c2000g.f14902i.getAndSet(null);
                if (c1999f == null) {
                    return;
                }
                c1999f.b(k3.a());
                return;
            case 13:
                ((C2003j) this.f13040p).a();
                return;
            case 14:
                C1995b c1995b = (C1995b) this.f13040p;
                Application application = (Application) c1995b.f14880o;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    if (applicationIcon == null) {
                        concat = null;
                    } else {
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", concat);
                    jSONObject.put("stored_infos_map", ((C1997d) c1995b.f14887v).a());
                } catch (JSONException unused) {
                }
                ((C2000g) c1995b.f14886u).f14900g.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                return;
            case 15:
                ((b3.b) this.f13040p).f();
                return;
            case 16:
                ((X0) ((B0.t) this.f13040p).d).D();
                return;
            case 17:
                O0 o02 = (O0) this.f13040p;
                Qw qw = o02.f15424q;
                long j6 = o02.f15422o;
                long j7 = o02.f15423p;
                ((Q0) qw.f6711q).g();
                Q0 q02 = (Q0) qw.f6711q;
                C0590f1 c0590f1 = q02.f15433e;
                C2066c0 c2066c0 = (C2066c0) q02.f1719a;
                x2.K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15401m.a("Application going to the background");
                T t4 = c2066c0.f15567h;
                C2066c0.g(t4);
                t4.f15451p.a(true);
                Bundle bundle = new Bundle();
                if (!c2066c0.f15566g.r()) {
                    ((P0) c0590f1.f8671q).a();
                    c0590f1.b(j7, false, false);
                }
                C2103v0 c2103v0 = c2066c0.f15575p;
                C2066c0.h(c2103v0);
                c2103v0.n(j6, bundle, "auto", "_ab");
                return;
            default:
                X0 x02 = (X0) this.f13040p;
                x02.t().g();
                x02.f15490k = new U(x02);
                C2083l c2083l = new C2083l(x02);
                c2083l.i();
                x02.c = c2083l;
                C2073g K2 = x02.K();
                X x4 = x02.f15482a;
                y.i(x4);
                K2.c = x4;
                L0 l02 = new L0(x02);
                l02.i();
                x02.f15488i = l02;
                ?? t02 = new T0(x02);
                t02.i();
                x02.f15485f = t02;
                O o4 = new O(x02, 1);
                o4.i();
                x02.f15487h = o4;
                R0 r02 = new R0(x02);
                r02.i();
                x02.f15484e = r02;
                x02.d = new B0.t(x02);
                if (x02.f15496q != x02.f15497r) {
                    x02.c().f15394f.c(Integer.valueOf(x02.f15496q), Integer.valueOf(x02.f15497r), "Not all upload components initialized");
                }
                x02.f15492m = true;
                x02.t().g();
                C2083l c2083l2 = x02.c;
                X0.I(c2083l2);
                c2083l2.P();
                if (x02.f15488i.f15410g.a() == 0) {
                    Q q4 = x02.f15488i.f15410g;
                    x02.d().getClass();
                    q4.b(System.currentTimeMillis());
                }
                x02.D();
                return;
        }
    }
}
