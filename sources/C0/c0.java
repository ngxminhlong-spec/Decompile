package C0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.EditProfileDialog;
import java.io.FileInputStream;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final EditProfileDialog f287b;
    public final ViewGroup c;
    public Bitmap d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f288e;

    /* renamed from: f, reason: collision with root package name */
    public final int f289f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f291h;

    public c0(v0 v0Var, ViewGroup viewGroup) {
        this.f291h = v0Var;
        this.f289f = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.profile_edit_change_size);
        this.c = viewGroup;
        EditProfileDialog editProfileDialog = (EditProfileDialog) viewGroup.findViewById(R.id.edit_profile_dlg);
        this.f287b = editProfileDialog;
        viewGroup.findViewById(R.id.profile_edit_dim).setOnClickListener(new ViewOnClickListenerC0022w(1, this));
        editProfileDialog.setListener(new x0.f(4, this));
    }

    public c0(D0.p pVar, ViewGroup viewGroup) {
        this.f291h = pVar;
        this.f289f = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.profile_edit_change_size);
        this.c = viewGroup;
        EditProfileDialog editProfileDialog = (EditProfileDialog) viewGroup.findViewById(R.id.edit_profile_dlg);
        this.f287b = editProfileDialog;
        viewGroup.findViewById(R.id.profile_edit_dim).setOnClickListener(new ViewOnClickListenerC0022w(6, this));
        editProfileDialog.setListener(new D3.d(7, this));
    }

    public static boolean a(c0 c0Var) {
        ViewGroup viewGroup = c0Var.c;
        if (viewGroup.getVisibility() == 8) {
            return false;
        }
        ((D0.p) c0Var.f291h).f618g0.setDrawerLockMode(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new b0(1, c0Var));
        viewGroup.startAnimation(alphaAnimation);
        return true;
    }

    public static boolean b(c0 c0Var) {
        ViewGroup viewGroup = c0Var.c;
        if (viewGroup.getVisibility() == 8) {
            return false;
        }
        ((v0) c0Var.f291h).f426h0.setDrawerLockMode(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new b0(0, c0Var));
        viewGroup.startAnimation(alphaAnimation);
        return true;
    }

    public final void c() {
        switch (this.f286a) {
            case 0:
                this.d = null;
                v0 v0Var = (v0) this.f291h;
                String q4 = AbstractC1806a.q(v0Var.h());
                EditProfileDialog editProfileDialog = this.f287b;
                editProfileDialog.setName(q4);
                editProfileDialog.setAvatar(AbstractC1806a.m(v0Var.h()));
                this.f288e = true;
                return;
            default:
                this.d = null;
                D0.p pVar = (D0.p) this.f291h;
                String q5 = AbstractC1806a.q(pVar.h());
                EditProfileDialog editProfileDialog2 = this.f287b;
                editProfileDialog2.setName(q5);
                editProfileDialog2.setAvatar(AbstractC1806a.m(pVar.h()));
                this.f288e = true;
                return;
        }
    }

    public final void d(Uri uri) {
        switch (this.f286a) {
            case 0:
                v0 v0Var = (v0) this.f291h;
                if (uri != null) {
                    try {
                        this.f290g = uri;
                        FileInputStream fileInputStream = new FileInputStream(v0Var.h().getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                        fileInputStream.close();
                        FileInputStream fileInputStream2 = new FileInputStream(v0Var.h().getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
                        options.inJustDecodeBounds = false;
                        int i4 = options.outWidth;
                        int i5 = options.outHeight;
                        int i6 = this.f289f;
                        int i7 = 1;
                        while (true) {
                            if (i4 / i7 <= i6 && i5 / i7 <= i6) {
                                if (i7 > 1) {
                                    i7 /= 2;
                                }
                                options.inSampleSize = i7;
                                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options);
                                this.d = decodeStream;
                                this.f287b.setAvatar(decodeStream);
                                this.f288e = false;
                                fileInputStream2.close();
                            }
                            i7 *= 2;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            default:
                D0.p pVar = (D0.p) this.f291h;
                if (uri != null) {
                    try {
                        this.f290g = uri;
                        FileInputStream fileInputStream3 = new FileInputStream(pVar.h().getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(fileInputStream3, null, options2);
                        fileInputStream3.close();
                        FileInputStream fileInputStream4 = new FileInputStream(pVar.h().getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
                        options2.inJustDecodeBounds = false;
                        int i8 = options2.outWidth;
                        int i9 = options2.outHeight;
                        int i10 = this.f289f;
                        int i11 = 1;
                        while (true) {
                            if (i8 / i11 <= i10 && i9 / i11 <= i10) {
                                if (i11 > 1) {
                                    i11 /= 2;
                                }
                                options2.inSampleSize = i11;
                                Bitmap decodeStream2 = BitmapFactory.decodeStream(fileInputStream4, null, options2);
                                this.d = decodeStream2;
                                this.f287b.setAvatar(decodeStream2);
                                this.f288e = false;
                                fileInputStream4.close();
                            }
                            i11 *= 2;
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
